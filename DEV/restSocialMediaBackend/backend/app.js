const express = require("express"); 
require('dotenv').config({ path: 'config.env' });
const mongoose = require('mongoose');
mongoose.set('strictQuery', false);
const route = require('./routes/user-routes');
const db = process.env.DB;
const blogRouter = require('./routes/blog-route')

const app = express();


app.use(express.json());
app.use('/api/users', route);
app.use('/api/blog', blogRouter);

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