const mongoose = require('mongoose');

//make schema
const userSchema = new mongoose.Schema({
    // schema takes in object in key value pairs 

    name: String, 
    age: Number, 
    email: String,
    createdAt: Date, 
    updatedAt: Date, 
    bestFriend : mongoose.SchemaTypes.ObjectId,          //this bestfriend is a reference to another object based on the id of another user object
    hobbies: [String],  //array of dirrefent strings
    address: {
        street: String, 
        city: String
    }
})

module.exports = mongoose.model("User", userSchema)