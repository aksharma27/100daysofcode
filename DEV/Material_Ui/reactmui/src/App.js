import React, { useState } from 'react';
import Sidebar from "./components/sidebar"
import Rightbar from "./components/Rightbar"
import Feed from "./components/Feed"
import Navbar from "./components/Navbar"
import Addpost from "./components/Addpost"
import { Box, Container, Stack } from '@mui/system';
import { createTheme, ThemeProvider } from '@mui/material';



function App() {
  const [mode, setMode] = useState("light");

  const darkTheme = createTheme({
    palette: {
      mode: mode
    }
  })

  return (
    //wrap the application with ThemeProvider for dark mode

    <ThemeProvider theme={darkTheme}>

      <Box bgcolor={"background.default"} color={"text.primary"}>   {/*primary color is white */}
        <Navbar />
        <Stack direction="row" spacing={2} justifyContent="center">
          <Sidebar setMode={setMode} mode={mode} />
          <Feed />
          <Rightbar />
        </Stack>
        <Addpost />
      </Box >
    </ThemeProvider >
  );
}

export default App;
