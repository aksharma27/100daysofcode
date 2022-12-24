const userModel = require('../models/user');
const jwt = require("jsonwebtoken");
const bcrypt = require("bcrypt");
const SECRET_KEY = 'NOTESAPI';

const signup = async (req, res)=>{
    //check existing user
    //makehashed password
    //user creation
    //token generate

    const {username, email, password} = req.body;
    try{
        const existingUser = await userModel.findOne({email: email});
        if(existingUser){
            return res.status(400).json({message: "user already exists"});
        }
        plaintext = req.body.password.toString();
        const hashedPasswords = await bcrypt.hash(plaintext, 10);
        
// const hashPassword = await bcrypt.hash();

        // create user 
        const result = await userModel.create({
            email: email,
            password: hashedPasswords,
            username: username  
        });

        //token generation (jwt) 
        //sign(payload, secret) method will geneate the token 
        const token = jwt.sign({email : result.email, id : result._id}, SECRET_KEY)
        res.status(201).json({user: result, token:token});
    }catch(err) {
        console.log(err);
        res.status(500).json({message: "something went wrong"})
    }
}


const signin = async (req, res)=>{ 
const {email, password} = req.body;
    try{
        const existingUser = await userModel.findOne({email:email});
        if(!existingUser){
            return res.status(404).json({message:"User not found"}); 
        }
        plaintext = req.body.password.toString();

        const matchPassword = await bcrypt.compare(plaintext, existingUser.password);
                                                 // this is normal pass     this is hashed password
        //check credentials                         
        if(!matchPassword){
            return res.status(400).json({message: "Invalid credentials"});
        }

        //signin by generating tokens
        const token = jwt.sign({email: existingUser.email, id: existingUser._id}, SECRET_KEY)
        res.status(201).json({user:existingUser, token: token});
    }
    catch(e){
        console.log(e);
        res.status(500).json({message: "something went wrong"});

    }
}

module.exports = {signin, signup};