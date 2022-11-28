const mongoose = require('mongoose');
const dotenv = require('dotenv');

const DB = process.env.DATABASE;

mongoose.connect(DB, {useNewUrlParser: true, useUnifiedTopology: true}, 
    (err)=>{
        if(err){
            console.log(err);
        }
        else{
            console.log("successfully connected");
        }
    });