var express = require("express");
const bodyParser = require("body-parser");
let ejs = require('ejs')

const app = express();
app.set("view engine", "ejs");
app.get("/", (req, res)=>{
   
    var today = new Date();
    var options = {
        day: "numeric",
        month: "long",
        weekday: "long",
        
    };
    var day = today.toLocaleDateString("en-US", options);

    res.render("list", {kindOfDay: day});
     
});

app.listen(3000, ()=>{
    console.log("Server started at posrt 3000 ")
})