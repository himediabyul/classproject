import React from "react";

// 상위컴포넌트에서 데이터를 전달받아서 출력하는 컴포넌트
function Details({product}){

    if(!product){
        return (
            <div>
                선택된 상품이 없습니다.
            </div>
        )
    }

    return (
        <div>
            <h3>상품 번호 : {product.pno} </h3>
            <h3>상품 이름 : {product.name} </h3>
            <h3>상품 가격 : {product.price} </h3>
        </div>
    )
}

export default Details