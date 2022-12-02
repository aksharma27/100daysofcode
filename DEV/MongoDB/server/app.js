const express = require('express');
const mongoose = require('mongoose');


//require dotenv 
const dotenv = require("dotenv");
dotenv.config({path: "./config.env"});
require('./db/conn'); 
// const auth = require('./router/auth');



const DB = process.env.DATABASE;
const PORT = process.env.PORT;

const app = express();

app.use(require('./router/auth')); 


//we link the router files to make our route easy
// app.use(auth);

// app.use(require('./router/auth'));


//middleware
const middleware = (req, res, next) =>{
    console.log("Hellow my middleware");
    next();
}

app.get("/", (req, res) => {
    res.send("Hello world home")
})
app.get("/contact", (req, res) => {
    res.send("Hello contact from server");
})
app.get("/about", middleware, (req, res) => {
    console.log("first middleware will be called")
    res.send("Hello about from server");
})
app.get("/singin", (req, res) => {
    res.send("Hello login from server");
})
app.get("/signup", (req, res) => {
    res.send("Hello Registration world from the server");
})


app.listen(PORT, ()=>{
    console.log(`app listening on port ${PORT}`);
})