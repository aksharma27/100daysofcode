import { Box } from '@mui/material'
import React from 'react'

const Rightbar = () => {
    return (
        <Box bgcolor="dodgerblue" flex={1} p={1} sx={{
            display:
            {
                xs: "none", sm: "block"
            }
        }}>
            Rightbar
        </Box>
    )
}

export default Rightbar
