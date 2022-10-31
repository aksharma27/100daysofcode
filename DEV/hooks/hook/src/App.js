import React from 'react'
import { useReducer } from 'react'

const reducer = (state, action) => {
  switch (action.type){
    case "INCREMENT" : 
      return {count: state.count + 1, showText: state.showText}

    case "TOGGLESHOWTEXT":
      return {count: state.count + 1, showText: !state.showText}  
}

const [state, dispatch] = useReducer(reducer, {
  count: 0,
  showText : true
})}

const App = () => {
  

  return (
    <div>
      <h1>{state.count}</h1>
      <button
        onClick={() => 
        
        {
          dispatch({type:"INCREMENT"}); 
        }}
      >Click Here</button>
    </div>
  )
  
}

export default App
