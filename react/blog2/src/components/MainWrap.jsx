import React from "react";
import Article from "./Article";
import Aside from "./Aside";

function MainWrap ({category,recent,posts}){

    return (
        <div id="wrap">
            <section>
                {posts.map((post, index)=>{

                    return <Article key={index}
                            title={post.title}
                            date={post.date}
                            imgUrl={post.imgUrl}
                            content={post.content}></Article>
                         
                })}
            </section>
            <Aside category={category} recent={recent} />
        </div>
    )
}
export default MainWrap