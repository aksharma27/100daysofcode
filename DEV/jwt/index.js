const express = require('express');
const app = express();
const noteRouter = require('./src/modles/noteRoute');
const userRouter = require('./src/modles/userRoute');
const dotenv = require('dotenv');
dotenv.config({path: "./config.env"});
const db = require('./src/modles/db');

const mongoose = require('mongoose');

app.use(express.json());

app.use('/users', userRouter);
app.use('/note', noteRouter);

app.get('/', (req, res)=>{
    res.send("hello");
});

db();


app.listen(process.env.PORT, ()=>{
    console.log(`app listening on port ${process.env.PORT}`);
});