import React from "react";
import { useState } from "react";

function Product(props){
    
    const id = props.pid
    const name = props.productName
    const price = props.productPrice

    const[list, setList] = useState('Not Selected')

    return(
        <ul>
            <li onClick={(event)=>{setList(event.target.list)}}>{name}</li>
        </ul>
    )
}
export default Product