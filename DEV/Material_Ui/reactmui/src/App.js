import './App.css';
import React, { useState } from 'react';
import Button from '@mui/material/Button';
import DeleteIcon from '@mui/icons-material/Delete';
import SettingsIcon from '@mui/icons-material/Settings';
// import { Typography } from '@mui/material';



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
        endIcon={<DeleteIcon />}
        variant="contained"
        color={"success"}
        onClick={() => { CustomMe() }}
        size="small"
        sx={{
          backgroundColor: "dodgerblue",
          color: "#fff",
          margin: "25px",
          "&:hover": {
            backgroundColor: "red"
          }
        }} >
        Click Me
      </Button >

      {/* <Typography varient="h1" component="h2">
        Hello there!
      </Typography> */}
    </div >
  );
}

export default App;
