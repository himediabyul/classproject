import React from "react";
import { useState } from "react";

const styles = {
    button : {
        width : 50,
        height : 30,
        backgroundColor : "blueviolet",
        borderRadius: 5,
        marginLeft : 3
    },

    text : {
        width : 150,
        height : 30,
        borderRadius: 5
    }
}

// 단어를, 상태로 관리하는 배열에 추가하는 함수를 받아서 처리
function WordInput ({addWord}){

    const [text, setText] = useState('')

    const handleClick = ()=>{
        addWord(text)
        setText('')
    }

    return (
        <div>
            <input value={text} onChange={(event) => setText(event.target.value)} style={styles.text} placeholder="단어입력"/>
            <button onClick={handleClick} style={styles.button}>add</button>
        </div>
    )

}
export default WordInput