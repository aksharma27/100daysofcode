const express = require('express');
const bodyParser = require('body-parser');
const ejs = require('ejs');
const mongoose = require('mongoose');
mongoose.set('strictQuery', true);
const connectDB = require('./db/connect');
const dotenv = require('dotenv');
dotenv.config({path: "./config.env"});
const products_routes = require('./routes/products');

const DB = process.env.DB;

const app = express();

app.set('view engine', 'ejs');

app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static("public"));



// const articleSchema = {
//     title: String, 
//     content: String 
// };

// const Article = mongoose.model("Article", articleSchema);

// //create/insert docs 
// const createDocument = async  () => {
//     try{
//         const js = new Article({
//             title: "js",
//             content: "js playlist thapa tech"
//         })
//         const mongodb = new Article({
//             title: "mongodb",
//             content: "mongodb playlist thapa"
//         })
//         const result = await Article.insertMany([js, mongodb]);
//         // console.log(result);

//     }
//     catch(err){
//         console.log(err);
//     }
// }

// createDocument();


// app.get('/articles', (req, res)=>{
//     Article.find((err, foundArticles)=>{
//         res.send(foundArticles);
//     })
// });


//middleware
app.use('/api/products', products_routes);


app.post('/articles/', (req, res)=>{
    console.log(req.body.title);
    console.log(req.body.content);

    // const newArticle = new 
})

const PORT = process.env.PORT || 3000;

const start = async () => {
    try{
        await connectDB(process.env.DB);
        app.listen(process.env.PORT || 3000, ()=>{
            console.log(`Server running on port: ${PORT}`)
        });
    }
    catch(err){
        console.log(err);
    }
};

start();