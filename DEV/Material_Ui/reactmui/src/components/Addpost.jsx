import { Avatar, Button, ButtonGroup, Fab, Stack, styled, TextField, Tooltip } from '@mui/material'
import Box from '@mui/material/Box';
import Typography from '@mui/material/Typography';
import Modal from '@mui/material/Modal';
import AddIcon from '@mui/icons-material/Add';
import React from 'react'
import { useState } from 'react';
import EmojiEmotionsIcon from '@mui/icons-material/EmojiEmotions';
import ImageIcon from '@mui/icons-material/Image';
import VideoLibraryIcon from '@mui/icons-material/VideoLibrary';
import PersonAddIcon from '@mui/icons-material/PersonAdd';
import DateRangeIcon from '@mui/icons-material/DateRange';


const StyledModal = styled(Modal)({
    opacity: "0.87",
    display: 'flex',
    alignItems: "center",
    justifyContent: "center",
    width: "100%",
})

const UserBox = styled(Box)({
    fontSize: "10px",
    gap: "7px",
    marginBottom: "200px",
    display: 'flex',
    alignItems: "center",

})

//FAB = floating action

const Addpost = () => {
    //state for adding modal to adddicon
    const [open, setOpen] = useState(false);



    return (
        <>
            <Tooltip onClick={e => setOpen(true)}
                title="AddPost" sx={{ position: "fixed", bottom: 30, left: { xs: "calc(50% - 25px)", md: 30 } }}>
                <Fab color="primary" aria-label="add">
                    <AddIcon />
                </Fab>
            </Tooltip>
            {/* Modal to add new post on clicking addicon */}
            <StyledModal
                open={open}
                onClose={e => setOpen(false)}
                aria-labelledby="modal-modal-title"
                aria-describedby="modal-modal-description"
            >
                <Box width={400} height={300} fontWeight="800" bgcolor={"background.default"} color={"text.primary"} fontSize="x-large" textAlign="center" lineHeight="3" p={3} borderRadius={5}>
                    <Typography varient="h1">Create a Post</Typography>

                    {/* Create avatar for adding post */}
                    <UserBox>
                        <Avatar src="https://avatars.githubusercontent.com/u/83135634?v=4" sx={{ width: 40, height: 40 }} />
                        <Typography>Abhishek</Typography>
                    </UserBox>
                    <TextField
                        sx={{
                            color: "white",
                            bottom: "50",
                            width: "100%",
                            height: "200%",
                            marginBottom: "20%",
                            marginTop: "-45%",
                            paddingBottom: "30%"
                        }}
                        id="outlined-textarea"
                        variant="standard"
                        color="warning"
                        focused
                        label={"What's on your mind?"} margin="none"
                        placeholder="What's on your mind?"
                        multiline
                    />

                    <Box direction="row" gap={1} mt={2}>
                        <EmojiEmotionsIcon color='secondary' />
                        <ImageIcon color="primary" />
                        <VideoLibraryIcon />
                        <PersonAddIcon />
                    </Box>
                    <ButtonGroup variant="contained" aria-label="outlined primary button group">
                        <Button>Post</Button>
                        <Button><DateRangeIcon /></Button>
                    </ButtonGroup>
                </Box>
            </StyledModal>
        </>
    )
}

export default Addpost
