const express = require('express');
const router = express.Router();

router.get("/", (req, res) => {
    res.send("hello world from server - router.js");
});

router.post("/register", (req, res)=>{
    // console.log(req.body);
    res.json({message: req.body});
    res.send('My register page');
    //it will not be shown on webpage, as it's a post request -> so use postman 
})


module.exports = router;