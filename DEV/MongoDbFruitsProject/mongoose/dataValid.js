const mongoose  = require('mongoose');

mongoose.connect("mongodb://abhishek27mjm:Abhishek02@cluster0-shard-00-00.qdpzn.mongodb.net:27017,cluster0-shard-00-01.qdpzn.mongodb.net:27017,cluster0-shard-00-02.qdpzn.mongodb.net:27017/?ssl=true&replicaSet=atlas-nj5dei-shard-0&authSource=admin&retryWrites=true&w=majorityl", {useNewParser: true});


//fruit schema
const fruitSchema = new mongoose.Schema({
    name: String,
    rating: Number, 
    review: String
});

//use schema to make a mongoose model
const Fruit = mongoose.model("Fruit", fruitSchema);

const fruit = new Fruit({       //fruit document 
    name: "Apple",
    rating: 9,
    review: "pretty solid as a fruit",
});

fruit.save();
