$("input").on("click", ()=>{
    $("ul").slideToggle();
})

//animate:
// $("button").on("click", ()=>{
//     $("h1").animate({opacity: "0.5"},2000);
//     $("h1").animate({margin: "20%"});
// })


//chaininig
$("button").on("click", ()=>{
    $("h1").slideUp().slideDown().animate({opacity: "0.7"}, 900);
})