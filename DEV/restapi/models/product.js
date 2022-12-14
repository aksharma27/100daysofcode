const mongoose = require('mongoose');

const productSchema = new mongoose.Schema({
    name: {
        type: String, 
        required: true
    },
    price: {
        type: Number,
        required: [true, "price must be provided"]
    },
    featured: {
        type: Boolean, 
        default: false 
    },
    rating: {
        type: Number,
        required: true,
        default: 5
    },
    createdAt:{
        type: Date,
        default: Date.now()
    },
    company: {
        type: String,
        
    }
});

module.exports = mongoose.model("Product", productSchema);