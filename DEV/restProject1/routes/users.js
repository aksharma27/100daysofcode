const express = require('express');
const router = express.Router();

const users = [
    {
        "fname" : "Abhishek",
        "lname": "Sharma",
        'age': 20

    }
]

router.get('/', (req, res) => {
    res.send("hello users");
    console.log(users);
});

router.post('/', (req, res) => {
    const user = req.body;
    users.push(user);
    res.send(user.fname + " " + user.age);
})


module.exports = router;