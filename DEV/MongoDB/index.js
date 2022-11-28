const express = require('express');
const mongoose = require('mongoose');


//require dotenv 
const dotenv = require("dotenv");
dotenv.config({path: "./config.env"});
require('./db/conn');


const DB = process.env.DATABASE;
const PORT = process.env.PORT;

const app = express();



app.listen(PORT, ()=>{
    console.log(`app listening on port ${PORT}`);
})