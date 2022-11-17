const express = require("express");
const bodyParser = require("body-parser");
let ejs = require('ejs')


const app = express();
app.set("view engine", "ejs");

let items = ["code-development", "dsa"];
let workItems = [];
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

    res.render("list", {listTitle: day, newListItems: items});
     
});

app.post("/", (req, res)=>{
    let item = req.body.newItem;
    console.log(req.body);
    if(req.body.list === "Work"){
        workItems.push(item);
        res.redirect("/work");
    }
   
    else{
        items.push(item);
        res.redirect("/");
    }

   

    
    // console.log(item);
}) ;

app.get("/work", (req, res)=>{
    res.render("list", {listTitle: "Work List", newListItems: workItems})
})
app.post("/work", (res, render)=>{
    let item = req.body.newItem;
    workItems.push(item);
    res.redirect("/work");
})


app.listen(3000, ()=>{
    console.log("Server started at port 3000 ")
})

