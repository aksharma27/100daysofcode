const express = require('express');
const getAllUser = require('../controllers/user-controller');
const router = express.Router();

router.get('/',getAllUser);

//signup routes for users
router.post('/signup', );

module.exports = router;