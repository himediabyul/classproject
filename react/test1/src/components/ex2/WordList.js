import React from "react";

const styles = {
    button : {
        width : 50,
        height : 30,
        backgroundColor : "gray",
        borderRadius: 5,
        marginLeft : 20
    }
}

function WordList ({words, removeWord}){

    const list = words.map((word, index)=>{

        return(
            <li key={index}>
                {word}
                <button style={styles.button} onClick={()=>removeWord(word)}>삭제</button>
            </li>
        )
    })

    return(
        <ul>
            {list}
        </ul>
    )
}

export default WordList