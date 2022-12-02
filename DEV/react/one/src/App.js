// import logo from './logo.svg';
// import './App.css';

function App() {
  
  const time = new Date();
  const ctime = time.getHours();
  let greeting;

  const constStyle = {
    color : "red"
  }

  if(ctime < 12){
    greeting = "Good morning";
  }
  else if(ctime > 12 && ctime < 6){
    greeting = "Good Afternood";
    constStyle.color = "green";
  }
  else{
    greeting = "Good Evening";
    constStyle.color = "blue";
  }
  return (
   <>
    <h1 style={constStyle}>
      {greeting}
    </h1>
   </>
  );
}

export default App;
