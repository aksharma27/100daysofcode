const connectDB = require('./db/connect');
const mongoose = require('mongoose');
const dotenv = require('dotenv');
const Product = require("./models/product")
// mongoose.set('strictQuery', false);
const ProductJson = require("./products.json")
mongoose.set('strictQuery', true);
const DB = process.env.DB;

const start = async () =>{
    try{
        await connectDB("mongodb+srv://aksharma27mjm:sfvsyAfd5kvMKraE@cluster0.9hiqs8c.mongodb.net/MERN_DATA?retryWrites=true&w=majority");
        await Product.deleteMany();
        await Product.create(ProductJson);
        console.log("Success");
    }
    catch(err){
        console.log(err)
    }
}

start();