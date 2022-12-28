import React from "react";
import Product from "./Product";


function ProductList (props){
    
    return(

        <div>
        <Product pid = '1' productName='상품1' productPrice= '4000'></Product>
        <Product pid = '2' productName='상품2' productPrice= '5000'></Product>
        <Product pid = '3' productName='상품3' productPrice= '6000'></Product>
        <Product pid = '4' productName='상품4' productPrice= '7000'></Product>
        </div>
    )
}
export default ProductList