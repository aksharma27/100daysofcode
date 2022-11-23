//jshint esversion:6
const express = require("express");
const mongoose = require('mongoose');
const app = express();

app.use(express.json());

//connection -> url/dbname, {useNewUrlParse: true}
mongoose.connect("mongodb://localhost:27017/fruitsDB", {useNewUrlParse: true, useUnifiedTopology: true}, (err)=>{
    if(err){
        console.log(err)
    }else{
        console.log("connected");
    }
});


//schena
const schema = {
    name : String, 
    email : String,
    id : Number
}

//attatch schema with mongoose model
const mongomodel = mongoose.model("NewCollection", schema)

app.listen(3000, ()=>{
    console.log("listening server on port 3000");
})





// /create a new schema
// const fruitSchema = new mongoose.Schema({
//     name : String, 
//     rating : Number, 
//     review: String 
// }); 
// //after creating the schema, we use it to create a mongoose model

// const Fruit = mongoose.model("Fruit", fruitSchema);     //this is a model

// const fruit = new Fruit  ({                 //object of Fruit model
//      name : "Apple",
//      rating: 7, 
//      review: "Pretty solid as a fruit."

// });

// fruit.save();   //save this fruit doc in to the Fruit model inside fruitsDB



// const findDocument = function(db, callback){
//     //get the docs collection
//     const colllection = db.collection("fruits");
//     //fint some docs
//     collection.find({}).toArray(function(err, fruits){
//         AuthenticatorAssertionResponse.equal(err, null);
//         console.log("Found the following records");
//         console.log(fruits);
//         callback(fruits);
//     })
// }