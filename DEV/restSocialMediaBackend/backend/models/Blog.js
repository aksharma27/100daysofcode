const mongoose = require('mongoose');


const Schema = mongoose.Schema;


const blogSchema = new Schema({
    title : {
        type: String,
        requires: true
    },
    description: {
        type: String,
        required: true
    },
    image: {
        type:String
    },
    user: {
        type: String,
        required: true
    },

});


const Blog = mongoose.model("Blog", blogSchema);
module.exports = Blog;