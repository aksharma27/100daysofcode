const express = require('express');
const mongoose = require('mongoose');

const app = express();

mongoose.connect("mongodb+srv://aksharma27mjm:Abhishek02@cluster0.9hiqs8c.mongodb.net/MERN_DATA?retryWrites=true&w=majority", {useNewUrlParser: true, useUnifiedTopology: true}, 
(err)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log("successfully connected");
    }
});

app.listen(3000, ()=>{
    console.log("app listening on port 3000");
})