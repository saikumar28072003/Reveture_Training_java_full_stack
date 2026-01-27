let products=[
    {id:201, Name:"Manideep",qty:12,price:50000},
    {id:202, Name:"sai kumar",qty:3,price:80000},
    {id:203, Name:"Nikhil",qty:5,price:38000},
    {id:204, Name:"Harish",qty:10,price:42000},
];

products.forEach((p)=>{
    console.log(`${p.id} -${p.Name} -${p.qty} -${p.price}`);
});

productsSortByPrice=products.sort((a,b)=>a.price - b.price);
console.log("\n \nproducts sort by price");
productsSortByPrice.forEach((p)=>{
    console.log(`${p.id} -${p.Name} -${p.qty} -${p.price}`);
});


let productprice=[45,900,23,780];
sortedProductprice=productprice.sort();
sortedProductprice.forEach((p)=>{
    console.log(p);
});