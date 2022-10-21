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
                    <Avatar alt="Sagnik Bairagya" url="https://instagram.fccu2-2.fna.fbcdn.net/v/t51.2885-19/310496409_159535520087587_2721178941537380459_n.jpg?stp=dst-jpg_s320x320&_nc_ht=instagram.fccu2-2.fna.fbcdn.net&_nc_cat=107&_nc_ohc=VC58_cbFyWEAX_FrPIo&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AT-YiSHVHcEBgsKeKQOIaRXBppMqm3ddSmNWSzDk0aY0Gw&oe=635883E8&_nc_sid=8fd12b" />
                    <Avatar alt="Abhishek Sharma" url="https://instagram.fccu2-2.fna.fbcdn.net/v/t51.2885-19/307979241_833306874708664_7062520864387190585_n.jpg?stp=dst-jpg_s320x320&_nc_ht=instagram.fccu2-2.fna.fbcdn.net&_nc_cat=104&_nc_ohc=DOlYw1IUSFMAX9ip3Ot&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AT_P60Z3VgVX95A1tgX-oy-4NFPNxRLRh0sB2zvESGYAKQ&oe=6357613D&_nc_sid=8fd12b" />
                    <Avatar alt="Rahul Shakya" src="/static/images/avatar/4.jpg" />
                    <Avatar alt="Renu Sharma" src="/static/images/avatar/5.jpg" />
                    <Avatar alt="Ajay Kumar Sharma" src="/static/images/avatar/5.jpg" />
                    <Avatar alt="Arti Shaw" src="/static/images/avatar/5.jpg" />
                </AvatarGroup>
            </Box>
        </Box>
    )
}

export default Rightbar
