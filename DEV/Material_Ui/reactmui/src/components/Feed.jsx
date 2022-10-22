import { Box } from '@mui/material'
import * as React from 'react';
import Post from './post';


function Feed() {

    return (
        <Box flex={3} p={3}>
            <Post />
            <Post />
            <Post />
            <Post />
            <Post />
        </Box>
    )
}

export default Feed
