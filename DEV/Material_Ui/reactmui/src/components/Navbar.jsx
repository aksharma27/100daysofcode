import { AppBar, Toolbar, styled, Typography, Box, InputBase, Badge, Avatar } from '@mui/material'
import React, { useState } from 'react'
// import CodeIcon from '@mui/icons-material/Code';
import MailIcon from '@mui/icons-material/Drafts';
import NotificationIcon from '@mui/icons-material/Notifications';
import Menu from '@mui/material/Menu';
import MenuItem from '@mui/material/MenuItem';
import DeviceHubIcon from '@mui/icons-material/DeviceHub';

const StyledToolbar = styled(Toolbar)({
    display: 'flex',
    justifyContent: 'space-between'
})

const Search = styled("div")(({ theme }) => ({
    backgroundColor: "white",
    padding: "0 10px",
    borderRadius: "2px",
    width: "40%",
}));

const Icons = styled(Box)(({ theme }) => ({
    display: "none",    //if mobile view = sm, display none
    gap: "17px",
    alignItems: "center",
    justifyContent: "center",
    [theme.breakpoints.up("sm")]: {     //only visible when sm size
        display: "flex",
    }
}));

const MobileView = styled(Box)(({ theme }) => ({
    display: "flex",
    flexDirection: "column",
    gap: "10px",
    [theme.breakpoints.up("sm")]: {     //if bigger than mobile view, no display
        display: "none",
    }
}));


const Navbar = () => {
    const [open, setOpen] = useState(false);
    return (
        <AppBar position="sticky">
            <StyledToolbar>
                <Typography varient="h6" sx={{ display: { xs: "none", sm: "block" } }}>
                    ABHI
                </Typography>
                <DeviceHubIcon sx={{
                    display: { xs: "block", sm: "none" }, pl: 2
                }} />

                <Search><InputBase placeholder='search...'></InputBase></Search>
                <Icons>
                    <Badge badgeContent={4} color="error">
                        <MailIcon color="#fff" />
                    </Badge>
                    <Badge badgeContent={2} color="error">
                        <NotificationIcon color="#fff" />
                    </Badge>
                    <Avatar sx={{ width: 30, height: 30 }} src="https://avatars.githubusercontent.com/u/83135634?v=4"
                        onClick={e => setOpen(true)}
                    />
                </Icons>
                <MobileView onClick={e => setOpen(true)}>        {/*for movile view*/}
                    <Avatar sx={{ width: 30, height: 30 }} src="https://avatars.githubusercontent.com/u/83135634?v=4" />
                    <Typography varient="span"></Typography>
                </MobileView>
            </StyledToolbar>

            <Menu
                id="basic-menu"

                open={open}
                onClose={(e) => setOpen(false)}
                anchorOrigin={{
                    vertical: 'top',
                    horizontal: 'right'
                }}
                MenuListProps={{
                    'aria-labelledby': 'basic-button',
                }}
            >
                <MenuItem >Profile</MenuItem>
                <MenuItem >My account</MenuItem>
                <MenuItem >Logout</MenuItem>
            </Menu>
        </AppBar >
    )
}

export default Navbar
