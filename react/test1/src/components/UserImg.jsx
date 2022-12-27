import React from "react";

function UserImg(props){

    return( <img className="userImage" src="{props.user.imgurl}" alt="{props.user.userName}" width="200" />)
}

export default UserImg;