import React, { useState } from 'react';
import Sidebar from "./components/sidebar"
import Rightbar from "./components/Rightbar"
import Feed from "./components/Feed"
import Navbar from "./components/Navbar"
import Addpost from "./components/Addpost"
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
      <Addpost />
    </Box >
  );
}

export default App;
