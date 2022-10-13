import './App.css';
import React, { useState } from 'react';
import Button from '@mui/material/Button';
import SettingsIcon from '@mui/icons-material/Settings';


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
        startIcon={<SettingsIcon />}
        variant="contained"
        color={"success"}
        onClick={() => { CustomMe() }}
        disabled={disableBtn}
        size="small" >
        Click Me
      </Button >
    </div >
  );
}

export default App;
