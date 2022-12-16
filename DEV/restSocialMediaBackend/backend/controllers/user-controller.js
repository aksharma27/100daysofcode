
const User = require("../models/User");

const getAllUser = async (req, res, next) => {
    let users;
    try{
        users = await User.findOne();
    }catch(err){
        console.log(err);
    } 

    if(!users){
        return res.status(404).json({message: "User not found"});
    }
    return res.status(200).json({users});
}

const signup = async(req, res, next) => {
    const {name, email, password} = req.body;

    //validation
    let existingUser;
    try{
        existingUser = await User.findOne({email});
    }catch(err){
        return console.log(err);
    }
    if(existingUser){
        return res.status(400).json({message: "user already exists! login instead"});
    }

    //make new user(singup)
    const user = new User({
        name,
        email,
        password
    });
    try{
        await user.save();
    }
    catch(err){
       return console.log(err);
    }
    return res.status(201).json({user})

}


const login = async (req, res, next) => {
    const {email, password} = req.body;     //we need only email and password for login
    let existingUser;
    try{
        existingUser = await User.findOne({email});
    }catch(err){
        return console.log(err);
    }
    if(!existingUser){
        return res.status(400).json({message: "user not found. Signup instead"});
    }
}

module.exports = {getAllUser, signup, login};