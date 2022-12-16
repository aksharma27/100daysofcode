const Blog = require('../models/Blog');


const getAllBlogs = async (req, res, next)=>{
    let blogs;
    try{
        blogs = await Blog.find();
    }catch(e){
        console.log(e);
    }

    if(!blogs){ //if blog is empgy
        return res.status(404).json({message: "No blog found"});
    }
    return res.status(200).json({blogs});
}

const addBlogs = async (req, res,next)=>{
    const {title, description, image, user} = req.body;
    const blog = new Blog({
        title, description, image, user
    });
    try{
        await blog.save();
    }catch(e){
        return console.log(e);
    }
    return res.status(200).json({blog});
}

module.exports = {getAllBlogs, addBlogs};