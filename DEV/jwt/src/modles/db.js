const mongoose = require('mongoose');
const dotevn = require('dotenv');
const DB = process.env.DB;

const db = ()=>{
    mongoose.connect(DB, {useNewUrlParser: true,
    useUnifiedTopology: true})
    .then(()=>{ 
        console.log("successfully connected to db")
}).catch((e)=>{
    console.log(e);
});
}


module.exports = db;