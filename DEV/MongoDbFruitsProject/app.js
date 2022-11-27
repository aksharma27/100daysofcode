// //jshint esversion:6
// const express = require("express");
// const mongoose = require('mongoose');
// const app = express();

// app.use(express.json());

// //connection -> url/dbname, {useNewUrlParse: true}
// mongoose.connect("mongodb://abhishek27mjm:Abhishek02@cluster0-shard-00-00.qdpzn.mongodb.net:27017,cluster0-shard-00-01.qdpzn.mongodb.net:27017,cluster0-shard-00-02.qdpzn.mongodb.net:27017/?ssl=true&replicaSet=atlas-nj5dei-shard-0&authSource=admin&retryWrites=true&w=majority", {useNewUrlParser: true, useUnifiedTopology: true}, (err)=>{
//     if(err){
//         console.log(err)
//     }else{
//         console.log("connected");
//     }
// });


// //schena
// const schema = {
//     name : String, 
//     email : String,
//     id : Number
// }

// //attatch schema with mongoose model
// const mongomodel = mongoose.model("NewCollection", schema);

// //POST ROUTE (POST REQUEST)
// app.post("/post", async(req, res)=>{
//     console.log("inside post function");

//     //variable to extract the data that we're passing into the above /post url
//     const data = new mongomodel({
//         name: req.body.name, 
//         email: req.body.email, 
//         id: req.body.id
//     });

//     //store all the data in the mongodb collection

//     const val = await data.save();
//     //response
//     res.json(val);  //val will send back to our postman as a response`


// })



// app.listen(3000, ()=>{
//     console.log("listening server on port 3000");
// })





const mongoose = require('mongoose');
mongoose.connect("mongodb://abhishek27mjm:Abhishek02@cluster0-shard-00-00.qdpzn.mongodb.net:27017,cluster0-shard-00-01.qdpzn.mongodb.net:27017,cluster0-shard-00-02.qdpzn.mongodb.net:27017/?ssl=true&replicaSet=atlas-nj5dei-shard-0&authSource=admin&retryWrites=true&w=majority", {useNewUrlParser: true});

const fruitSchema = new mongoose.Schema({
    name : String,
    rating: Number, 
    review: String
});

const Fruit = mongoose.model("Fruit", fruitSchema);

const fruit = new Fruit({
    name :"Apple",
    rating:7,
    review: "solid as a fruit"
});

fruit.save();