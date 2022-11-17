var numberOfDrumButtons = document.querySelectorAll(".drum").length;

for (var i = 0; i < numberOfDrumButtons; i++) {

  document.querySelectorAll(".drum")[i].addEventListener("click", function() {
    // var tom1 = new Audio("./sounds/tom-1.mp3");
    // tom1.play();
    

    var buttonInnerHTML = this.innerHTML;     //this is the identity of the button which is pressed or triggered -> gives access to the button/object
    switch(buttonInnerHTML) {
      case "w" :
        var tom1 = new Audio("./sounds/tom-1.mp3");
        tom1.play();
        tomsObj.audios[1].play();
        break;
  
      case "a":
        var tom2 = new Audio("sounds/tom-2.mp3");
        tom2.play();
        break;
  
      case "s":
        var tom3 = new Audio('sounds/tom-3.mp3');
        tom3.play();
        break;
  
      case "d":
        var tom4 = new Audio('sounds/tom-4.mp3');
        tom4.play();
        break;
  
      case "j":
        var snare = new Audio('sounds/snare.mp3');
        snare.play();
        break;
  
      case "k":
        var crash = new Audio('sounds/crash.mp3');
        crash.play();
        break;
  
      case "l":
        var kick = new Audio('sounds/kick-bass.mp3');
        kick.play();
        break;
  
  
      default: console.log(key);

    }
    makeSound(buttonInnerHTML);
    buttonAnimation(buttonInnerHTML);

  });

}

document.addEventListener("keydown", (e)=> {

  makeSound(e.key);

  buttonAnimation(e.key);

});

const tomsJSON = { "audios":["sounds/tom-1.mp3"]};
const tomsObj = JSON.parse(tomsJSON);


function makeSound(key) {

  switch (key) {
    case "w":
      var tom1 = new Audio("./sounds/tom-1.mp3");
      tom1.play();
      tomsObj.audios[1].play();
      break;

    case "a":
      var tom2 = new Audio("sounds/tom-2.mp3");
      tom2.play();
      break;

    case "s":
      var tom3 = new Audio('sounds/tom-3.mp3');
      tom3.play();
      break;

    case "d":
      var tom4 = new Audio('sounds/tom-4.mp3');
      tom4.play();
      break;

    case "j":
      var snare = new Audio('sounds/snare.mp3');
      snare.play();
      break;

    case "k":
      var crash = new Audio('sounds/crash.mp3');
      crash.play();
      break;

    case "l":
      var kick = new Audio('sounds/kick-bass.mp3');
      kick.play();
      break;


    default: console.log(key);

  }
}


function buttonAnimation(currentKey) {

  var activeButton = document.querySelector("." + currentKey);

  activeButton.classList.add("pressed");

  setTimeout(function() {
    activeButton.classList.remove("pressed");
  }, 100);

}