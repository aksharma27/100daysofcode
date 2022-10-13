import './App.css';
import React, { useState } from 'react';
import Button from '@mui/material/Button';
// import Delete from '@mui/material/Delete';
import { Delete } from '@mui/material/icons/Delete';


function App() {

  const [color, setColor] = useState("primary");
  const [disableBtn, setDisableBtn] = useState(false);

  function CustomMe() {
    setColor("secondary");
    setDisableBtn(true);
    // alert("funciton called");
  }

  return (
    <div className="App">
      <h1>React MUI</h1>
      <Button
        startIcon={<Delete />}
        variant="outlined"
        color={color}
        onClick={() => { CustomMe() }}
        disabled={disableBtn}
        size="small" >
        Click Me
      </Button >
    </div >
  );
}

export default App;
