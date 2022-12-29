import React from "react";

function Aside ({category, recent}){

    return (

        <aside>
            <h5>카테고리</h5>
            <ul>
                {category.map((item, index) => <li key={index}><a href={item.linkUrl}>{item.name}</a></li>)}
            </ul>

            <h5>최신글</h5>
            <ul>
                {recent.map((item, index) => <li key={index}><a href={item.linkUrl}>{item.name}</a></li>)}
            </ul>
        </aside>
    )
}

export default Aside