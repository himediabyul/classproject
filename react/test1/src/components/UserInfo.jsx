import React from "react";

function UserInfo(props){

    return( 
        <><div className="userInfo">
            <Userimg user={props.user} />
        </div><div className="userInfoName">
                {props.user.userName}
            </div></>)

}

export default UserInfo;