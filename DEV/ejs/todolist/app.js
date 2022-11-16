const express = require("express");
const bodyParser = require("body-parser");
let ejs = require('ejs')

const app = express();
app.set("view engine", "ejs");

let items = ["code-development", "dsa"];
app.use(bodyParser.urlencoded({ extended:true}));

app.use(express.static("public"));                 //serve static files like css and js

app.get("/", (req, res)=>{
   
    let today = new Date();
    let options = {
        day: "numeric",
        month: "long",
        weekday: "long",
        
    };
    let day = today.toLocaleDateString("en-US", options);

    res.render("list", {kindOfDay: day, newListItems: items});
     
});

app.post("/", (req, res)=>{
    let item = req.body.newItem;

    items.push(item);

    res.redirect("/");
    // console.log(item);
}) 


app.listen(3000, ()=>{
    console.log("Server started at posrt 3000 ")
})

