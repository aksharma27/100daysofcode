var noButtons = document.querySelectorAll("button").length;

for (var i = 0; i < noButtons; i++) {
    document.querySelectorAll("button")[i].addEventListener("click", function(){
        var buttonInnerHtml = this.innerHTML;

        switch(buttonInnerHtml) {
            case "one" : alert("one pressed") ;
            break;

            case "two" : alert("two pressed") ;
            break;

            case "three" : alert("three pressed") ;
            break;

            default : alert("can't recognize click");
            break;
        }
    })
}