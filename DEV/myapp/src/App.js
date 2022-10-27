// import logo from './logo.svg';
import './App.css';
import React from 'react';  
import Counter from './Counter';

const Person = (props) =>{
  return(
    <>
    <h1>Name : {props.name}</h1>
    <h2>Last Name : {props.lastname}</h2>
    <h2>Age : {props.age}</h2>
    <Counter/>
    </>
  )
}

function App() {
  return(
    <>
    <Person 
    name="Abhishek"
     lastname="Sharma" 
     age={20}
     />

     <Person
      name='Sofia'
      lastname='Iram'
      age={21}
      />
    
    
        </>    
  )

  
}

export default App;
