import React from "react";
import { useState } from "react";

function Signup (props){

    const [name, setName] = useState('')
    const [gender, setGender] = useState('여자')

    const handleSubmit = (event) =>{
        event.preventDefault()
        alert(`이름: ${name} , 성별: ${gender}`)
    }

    return (
        <form onSubmit={handleSubmit}>
            <label>
                이름: <input type="text" value={name} onChange={(event) => {setName(event.target.value)}}/>
            </label>
            <br/>
            <label>
                성별: <select value={gender} onChange={(event)=> {setGender(event.target.value)}}>
                    <option value="남자">남자</option>
                    <option value="여자">여자</option>
                </select>
            </label>
            <br/>
            <button type="submit">제출</button>
        </form>
    )
}
export default Signup