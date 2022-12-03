import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
import {Add, Sub, Div, Mul} from "./calculator";
import store from "./store";

//subsribe() is a change listner
store.subsribe(() => console.log(store.getState()));
// OR  
// import * as Calculator from "./calculator";


const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
    {Add(1,2)}
    {Sub(4,3)}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
