import React from "react";

// 상위 컴포넌트에서 배열을 받아 리스트 출력
// 클릭 이벤트에 적용할 핸들러를 받아서 적용
// {mno: 1, name: '상품1'},{mno: 2, name: '상품2'}......
// selectProduct => 상품 번호를 받아서 선택 상품의 상태를 변경시키는 역할
function Display ({arr, selectProduct}) {

    return (
        <div>
            <ul>
                {arr.map(product => <li key={product.pno} onClick={()=>selectProduct(product.pno)}>{product.name}</li>)}
            </ul>
        </div>
    )

}
export default Display