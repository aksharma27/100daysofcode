const Product = require("../models/product");


const getAllProducts = async (req, res) => {

    const {company, name, sort} = req.query;
    const queryObject = {};

    if(company){
        queryObject.company = company;
    }
    if(name){
        //mongodb regex for wrong but similar names passed. eg: ifone, iphon, ihone, etc;
        queryObject.name = {$regex: name, $options: "i"};
    }
    console.group(queryObject);

    if(sort){
        let sortFix = sort.replace(",", " ");
        queryObject.sort = sortFix;
    }


    const myData = await Product.find(queryObject  );
    res.status(200).json({myData});
};

const getAllProductsTesting = async (req, res) => {
    const myData = await Product.find(req.query).sort("-price");
    res.status(200).json({myData});
}

module.exports = {getAllProducts, getAllProductsTesting};