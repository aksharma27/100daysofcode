const express = require('express');
const blogRouter = express.Router();
const Modules = require('../controllers/blog-controller');
const getAllBlogs = Modules.getAllBlogs;
const addBlogs = Modules.addBlogs;


blogRouter.get('/', getAllBlogs);
blogRouter.post('/add', addBlogs);

module.exports = blogRouter;