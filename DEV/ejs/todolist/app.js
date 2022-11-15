var express = require("express");
const bodyParser = require("body-parser");
let ejs = require('ejs')

const app = express();
app.set("view engine", "ejs");


app.use(bodyParser.urlencoded({ extended:true}));

app.get("/", (req, res)=>{
   
    var today = new Date();
    var options = {
        day: "numeric",
        month: "long",
        weekday: "long",
        
    };
    var day = today.toLocaleDateString("en-US", options);

    res.render("list", {kindOfDay: day, newListItems: items});
     
});

app.post("/", (req, res)=>{
    var item = req.body.newItem;
    console.log(item);
}) 


app.listen(3000, ()=>{
    console.log("Server started at posrt 3000 ")
})

