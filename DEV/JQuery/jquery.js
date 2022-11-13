$("body").keydown((e)=>{
    $("h1").text(e.key);
});

$("h1").on("click", ()=>{
    $("h1").css("color", "crimson");
});

$("button").on("click", ()=>{
    $("h1").fadeToggle(5000);
})