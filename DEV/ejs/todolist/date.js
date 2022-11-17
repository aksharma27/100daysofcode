// console.log(module);
// module.exports = "hello world";
module.exports.getDate = getDate;

function getDate() {

    let today = new Date();
    let options = {
    day: "numeric",
    month: "long",
    weekday: "long",
    
};
let day = today.toLocaleDateString("en-US", options);
return day;
}

// let day = today.toLocaleDateString("en-US", options);
// return day;


module.exports.getDay = getDay;
function getDay(){
    let today = new Date();

    let options = {
        weekday : "long"
    };
    let day = today.toLocaleDateString("en-US", options);
    return day;
}

