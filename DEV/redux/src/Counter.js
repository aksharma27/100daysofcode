import React, {useContext} from 'react'
import { CountContext } from './App';

const Counter = (props) => {
    const countState =  useContext(CountContext);  
    console.log("Count is : ", countState)
  return (
    <div>
      Count is : {countState.countState.count};
    </div>
  )
}

export default Counter
