var noButtons = document.querySelectorAll("button").length;

for (var i = 0; i < noButtons; i++) {
    document.querySelectorAll("button")[i].addEventListener("click", function(){
        var audio = new Audio("");
        audio.play();
            alert("Hi " + housekeeper1.name + " is " + housekeeper1.age + " years old"
            + " and her hobbies are: " + housekeeper1.hobbies + "Hi " + housekeeper2.name + " is " + housekeeper2.age + " years old"
            + " and her hobbies are: " + housekeeper2.hobbies);    
    })
}