//12 hr = 360 deg
// 1 hr = 360 / 12 = 30 deg


//minutes:
//60 min = 30 deg
//m mins = m / 2 rotate

//30 h + m / 2


//min hand: -------------------------------
// 60 min = 360 deg
// 1 min = 6 deg 
// m mins = 6 m mins


//second hand:  --------------------------------
// 60 sec = 360 deg 
// 1 sec = 6 deg 
// s sec = 6 s deg

const  secondHand = document.querySelector('.second-hand');
const minuteHand = document.querySelector('.min-hand');
const hourHand = document.querySelector('.hour-hand');

function setDate(){ 
    const date = new Date();

const seconds = date.getSeconds();
const secondsDegrees = ((seconds / 60) * 360) + 90;
secondHand.style.transform = `rotate(${secondsDegrees}deg)`;

const mins = date.getMinutes();
  const minsDegrees = ((mins / 60) * 360) + ((seconds/60)*6) + 90;
  minuteHand.style.transform = `rotate(${minsDegrees}deg)`;


  const hour = date.getHours();
  const hourDegrees = ((hour / 12) * 360) + ((mins/60)*30) + 90;
  hourHand.style.transform = `rotate(${hourDegrees}deg)`;
}

setInterval(setDate, 1000);

setDate();