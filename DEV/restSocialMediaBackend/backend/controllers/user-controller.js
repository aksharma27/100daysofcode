
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

module.exports = getAllUser;