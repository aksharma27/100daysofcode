// console.log(module);
// module.exports = "hello world";
module.exports.getDate = () =>{

    let today = new Date();
    let options = {
    day: "numeric",
    month: "long",
    weekday: "long",
    
};
return today.toLocaleDateString("en-US", options);

}

// let day = today.toLocaleDateString("en-US", options);
// return day;


module.exports.getDay = () => {
    let today = new Date();

    let options = {
        weekday : "long"
    };
    return today.toLocaleDateString("en-US", options);
    // return day;
}

