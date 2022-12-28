import React from "react";
import { useState } from "react";
import Dialog from "./Dialog";

let room = []

function SignUpDialog(props){

    const[nickName,setNickName] = useState('')

    const handleClick = () =>{

        alert(`어서오세요~!! ${nickName}님`)
        
        room.push(nickName)  // room 배열에 넣기

        setNickName('')
    }

    return(
        <Dialog title="프로젝트 팀 참여" message="닉네임을 입력해주세요.">
            <input type="text" value={nickName} onChange={(event)=>{setNickName(event.target.value)}} />
            <button onClick={handleClick}>참여하기</button>
            <>
                {room.map((name, index)=>{
                    return <p key={index}>{name}</p>
                })}
            </>
        </Dialog>
    )
}
export default SignUpDialog