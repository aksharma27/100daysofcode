import { Avatar, AvatarGroup, Box, Typography } from '@mui/material'
import React from 'react'

const Rightbar = () => {
    return (
        <Box flex={1} p={1} sx={{
            display:
            {
                xs: "none", sm: "block"
            }
        }}>
            <Box position="fixed">
                <Typography varient="h6" fontWeight={300}>Online Friends</Typography>
                <AvatarGroup max={7} total={24}>
                    <Avatar alt="Remy Sharp" src="https://material-ui.com/static/images/avatar/1.jpg" />
                    <Avatar alt="Travis Howard" src="https://material-ui.com/static/images/avatar/2.jpg" />
                    <Avatar alt="Cindy Baker" src="https://material-ui.com/static/images/avatar/3.jpg" />
                    <Avatar alt="Remy Sharp" src="" />
                    <Avatar alt="Travis Howard" src="https://material-ui.com/static/images/avatar/2.jpg" />
                    <Avatar alt="Cindy Baker" src="https://material-ui.com/static/images/avatar/3.jpg" />
                    <Avatar alt="Cindy Baker" src="https://material-ui.com/static/images/avatar/3.jpg" />
                </AvatarGroup>
            </Box>
        </Box>
    )
}

export default Rightbar
