const express = require("express"); // see https://github.com/motdotla/dotenv#how-do-i-use-dotenv-with-import
const mongoose = require("mongoose"); // see https://github.com
require('dotenv').config({ path: 'config.env' });
mongoose.set('strictQuery', false);
const router = require('./routes/user-routes');
const db = process.env.DB;

const app = express();

app.use('/api/users', router);

mongoose.connect(process.env.DB, {useUnifiedTopology:true,
    useNewUrlParser: true}).then(()=>{
    console.log("db connected");
}).catch((err)=>{
    console.log(err); 
})

app.use('/', (req, res)=>{
    res.send("Hello home");
})



app.listen(3000, ()=>{
    console.log("listening on 3000");
})