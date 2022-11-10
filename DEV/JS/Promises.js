let p = new Promise((resolve, reject) => {
    let a = 1 + 3;
    if(a === 2){
        resolve('success');
    }
    else{
        reject('error');
    }
})

// anything in .then will run for resolve   &&  .catch() for reject case
 p.then((message)=>{
    console.log('This is the .then ' + message);
})
.catch((message) => {
    console.log('This is the .catch ' + message);
})