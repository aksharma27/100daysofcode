//12 hr = 360 deg
// 1 hr = 360 / 12 = 30 deg


//minutes:
//60 min = 30 deg
//m mins = m / 2 rotate

//30 h + m / 2


//min hand: -------------------------------
// 60 min = 360 deg
// 1 min = 6 deg 
// m mins = 6 m mins


//second hadn:  --------------------------------
// 60 sec = 360 deg 
// 1 sec = 6 deg 
// s sec = 6 s deg

setInterval(() => {
    date = new Date();
    htime = d.getHours();
    mtime = d.getMinutes();
    stime = d.getSeconds();

    hrot = 30 * htime + mtime / 2;
    mrot = 6 * mtime;
    srot = 6 * stime;

    hour.style.transform = `rotate()`
}, 1000)
