// import React from 'react'
import { Checkbox } from '@mui/material'
import * as React from 'react';
import { styled } from '@mui/material/styles';
import Card from '@mui/material/Card';
import CardHeader from '@mui/material/CardHeader';
import CardMedia from '@mui/material/CardMedia';
import CardContent from '@mui/material/CardContent';
import CardActions from '@mui/material/CardActions';
import Collapse from '@mui/material/Collapse';
import Avatar from '@mui/material/Avatar';
import IconButton from '@mui/material/IconButton';
import Typography from '@mui/material/Typography';
import { red } from '@mui/material/colors';
import FavoriteIcon from '@mui/icons-material/Favorite';
import ShareIcon from '@mui/icons-material/Share';
import ExpandMoreIcon from '@mui/icons-material/ExpandMore';
import MoreVertIcon from '@mui/icons-material/MoreVert';
import { Favorite, FavoriteBorder, Label } from '@mui/icons-material';

const Post = () => {
    const date = new Date();
    return (
        <Card sx={{ margin: 2 }}>
            <CardHeader
                avatar={
                    <Avatar sx={{ bgcolor: red[500] }} aria-label="recipe">
                        AS
                    </Avatar>
                }
                action={
                    <IconButton aria-label="settings">
                        <MoreVertIcon />
                    </IconButton>
                }
                title="Abhishek Sharma"
                subheader={date.getDate() + ' - ' + date.getMonth() + ' - ' + date.getFullYear()}
            />
            <CardMedia
                component="img"
                height="10%"
                image="https://images.unsplash.com/photo-1607705703571-c5a8695f18f6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1170&q=80"
                alt="Abhishek Kumar Sharma"
            />
            <CardContent>
                <Typography variant="body2" color="text.secondary">
                    Abhishek is a passionate programmer, who's currently working on his projects on MERN Stack
                    and also in hi DSA skills. He's really hard working and and always does something out of the box.
                    This is his project on material ui, it's a prototype of a social network with feeds and sidebars showing
                    online friends and some basic information, and navigation bar with a search componenet in it.
                    This project is purely based on react and its components, props and material ui etc.
                </Typography>
            </CardContent>
            <CardActions disableSpacing>
                <IconButton aria-label="add to favorites">
                    <Checkbox icon={<FavoriteBorder />} checkedIcon={<Favorite sx={{ color: "red" }} />} />
                </IconButton>
                <IconButton aria-label="share">
                    <ShareIcon />
                </IconButton>

            </CardActions>

        </Card>
    )
}

export default Post
