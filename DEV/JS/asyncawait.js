function makeRequest(location){
    return new Promise((resolve, reject) => {
        console.log(`Making request ${location}`);
        if(location === 'Google'){
            resolve('Google says hi');
        }
        else{
            reject('We can only talk to Google');
        }
    })
}

//promises way: 
function processRequest(response){
    return new Promise((resolve, reject) => {
        console.log('Processing request');
        resolve(`Extra Information: ${response}`);
    })
}

// makeRequest('Facebook').then(response => {
//     console.log('Response received');
//     return processRequest(response)
// }).then(processResponse => {
//     console.log(processResponse);
// }).catch(err =>{
//     console.log(err)
// })

// async function doWait(){

// }


//using async await
async function doWork(){
    try{
        const response = await makeRequest('Facebook')         //wait untill this request is finished
    console.log('response received');
    const processedResponse = await processRequest(response);
    console.log(processedResponse);
    }
    catch(e){
        console.log(e);
    }
}
doWork();