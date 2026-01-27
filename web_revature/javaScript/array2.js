
    let player_list=[
        {id:18, Name:"Virat kohli", Age:37,country:"india"},
        {id:7, Name:"M S Dhoni", Age:44,country:"india"},
        {id:45, Name:"Rohit sharma", Age:38,country:"india"},
        {id:17, Name:"A B villiers", Age:41,country:"south africa"}
    ];

    player_list.forEach((p)=>{
            console.log(`${p.id} -${p.Name} -${p.Age} -${p.country}`);
            
    });

    playersSortedByAge =player_list.sort((a,b)=>a.Age-b.Age);
    console.log("\n\n playersSortedByAge");
    playersSortedByAge.forEach((p)=>{
        console.log(`${p.id} -${p.Name} -${p.Age} -${p.country}`);
    });

    let playerAge=[45,37,23,20,34,54,18];
sortedPlayerAge=playerAge.sort();
sortedPlayerAge.forEach((p)=>{
    console.log(p);
});


