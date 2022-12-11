import { useState, useReducer } from 'react';
import Counter from './Counter';
import './App.css';



const inititalState = {
  count: 0
}

//create a context
export const CountContext = React.createContext(inititalState);



//create reducer function
function countReducer(state = inititalState, action){
  switch(action.type){
    case "INC_COUNTER":{ 
      const newState = {
        count: state.count + action.payload
      };
      return newState;
    }

    default: return state;
   }
 
}

function App() {

  //useReducer hook:
  //pass the data by provider and consume the data using consumer
  const [countState, dispatch] = useReducer(countReducer, inititalState)
  return (
    <CountContext.Provider value={{countState, dispatch}}>
    <div>
      <Counter/>
    </div>
    </CountContext.Provider>
  );
}

export default App;
