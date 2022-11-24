const mongoose = require('mongoose');
const User = require("./User");

mongoose.connect("mongodb://abhishek27mjm:Abhishek02@cluster0-shard-00-00.qdpzn.mongodb.net:27017,cluster0-shard-00-01.qdpzn.mongodb.net:27017,cluster0-shard-00-02.qdpzn.mongodb.net:27017/?ssl=true&replicaSet=atlas-nj5dei-shard-0&authSource=admin&retryWrites=true&w=majority"); 


async function run(){ 

run() 
//create a new User object
// const user = new User({name: "Abhishek", age: 20});
//now save the user database, just a local copy in our program
const user = await User.create({
    name: "Abhishek",
     age: 20, 
     hobbies : ["weight lifting", "weight lifting"],
     address: {
        street: "hill road", 
        city
     }
})     //user created
user.name = "Sally";        //update/change some data in the db, but it is not saveed in the db, use .save() method
await user.save();
// await user.save();
console.log(user);
}