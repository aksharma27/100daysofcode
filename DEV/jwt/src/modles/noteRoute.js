const express = require('express');
const noteRouter = express.Router();

noteRouter.get('/', (req, res)=>{
    res.send("note Post Request");
});

noteRouter.post('/', (req, res)=>{
    res.send("note Post Request");
})

module.exports = noteRouter;