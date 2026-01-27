//creating a promise    
let paymentPromise =new Promise((resolve,rejected)=>{
    let paymentSuccess=true;
    setTimeout(() => {
    if(paymentSuccess){
        resolve("payment done successfully");
    }else{
        rejected("payment failed");
    }
},5000);
});

//consuming the promise
paymentPromise.then((result)=>{
   console.log(result);
   
}).catch((error)=>{
    console.log(error);
}).finally(()=>{
    console.log("payment process completed");
}); 