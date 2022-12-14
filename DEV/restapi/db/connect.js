const mongoose = require('mongoose');


const connectDB = (DB) => {
    return mongoose.connect(DB, {useNewUrlParser: true}, {useUnifiedTopology: true}).then(()=>{
        console.log('Connected to db');
    }).catch((err)=>{
        console.log("ERROR: " + err)
    })
};

// connectDB();

module.exports = connectDB;