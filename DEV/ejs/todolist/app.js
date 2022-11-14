var express = require("express");
const bodyParser = require("body-parser");
let ejs = require('ejs')

const app = express();
app.set("view engine", "ejs");
app.get("/", (req, res)=>{
   
    var today = new Date();
    var  day = "";
    if(today.getDay() === 0){
        day = "Sunday";
    }
    else if(today.getDay() === 1){
        day = "Monday";
    }
   
    else if(today.getDay() === 2){
        day = "Tudesday";
    }
   
    else if(today.getDay() === 3){
        day = "Wednesday";
    }
   
    else if(today.getDay() === 4){
        day = "Thursday";
    }
   
    else if(today.getDay() === 5){
        day = "Friday";
    }
    else{
        day = "Saturday";
     }
     res.render("list", {kindOfDay: day});
});

app.listen(3000, ()=>{
    console.log("Server started at posrt 3000 ")
})