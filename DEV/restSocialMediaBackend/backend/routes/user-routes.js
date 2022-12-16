const express = require('express');
const Modules = require('../controllers/user-controller');
const getAllUser = Modules.getAllUser;
const signup = Modules.signup;
const login = Modules.login;

const route = express.Router();

route.get('/',getAllUser);

//signup routes for users
route.post('/signup', signup);
route.post('/login', login);

module.exports = route;