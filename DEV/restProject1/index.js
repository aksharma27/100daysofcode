const express = require('express');
const bodyParser = require('body-parser');
const dotenv = require("dotenv");
const usersRoutes = require('./routes/users.js');
const PORT = process.env.PORT || 3000;

const app = express();


app.use(bodyParser.json());

app.get('/', (req,res)=>{
    console.log("TEST")
    res.send("hello from home pge");
});
app.use('/users', usersRoutes)


app.listen(PORT, ()=>{
    console.log("server listening on " + PORT);
})