import React, { useState } from 'react';
import Sidebar from "./components/sidebar"
import Rightbar from "./components/Rightbar"
import Feed from "./components/Feed"
import Navbar from "./components/Navbar"
import { Box, Container, Stack } from '@mui/system';



function App() {
  return (
    <Box>
      <Navbar />
      <Stack direction="row" spacing={2} justifyContent="center">
        <Sidebar />
        <Feed />
        <Rightbar />
      </Stack>
    </Box>
  );
}

export default App;
