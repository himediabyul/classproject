import React from "react";
import { useState } from "react";
import Details from "./Details";
import Display from "./Display";

// 컨트롤러 역할
// 하위 컴포넌트에 전달할 데이터 가지고 있어야함
// 상태 값 가지고 있고 하위 컴포넌트에 전달
// 상태 값을 변경해주는 함수 하위 컴포넌트에 전달

const products = [
    {pno:1, name:'아메리카노', price: 1000},
    {pno:2, name:'밀크티', price: 2000},
    {pno:3, name:'프라푸치노', price: 3000}
]

const style = {
    wrapper: {
        padding:20,
        display: "flex",
        flexDirection: "row",
        justifyContent: "space-around"
    }
}

function Container (props) {

    // 선택한(클릭) 메뉴를 속성으로 저장 => Detail 로 데이터 전달
    // selectedProduct => {pno:3, name:'프라푸치노', price: 3000}
    const [selectedProduct, setSelectedProduct] = useState()

    const changeProduct = (pno) => {
        // 상품 번호로 배열에서 상품 검색 => 해당 상품의 객체를 반환
        const product = products.find(product => product.pno === pno)
     
        // 속성으로 관리하는 선택 상품의 값을 변경
        setSelectedProduct(product)
    }

    return(
        <div style={style.wrapper}>
            <Display arr={products} selectProduct={changeProduct} />
            <Details product={selectedProduct} />
        </div>
    )

}

export default Container