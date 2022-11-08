var noButtons = document.querySelectorAll("button").length;

for (var i = 0; i < noButtons; i++) {
    document.querySelectorAll("button")[i].addEventListener("click", function(){
        alert("all buttons got clicked");
    })
}