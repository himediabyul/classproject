import React from "react";
import { useState } from "react";

function useCounter(initVal){

    const [count, setCount] = useState(initVal)

    const incrementCount = () => setCount((count) => count+1)

    const decrementCount = () => setCount((count) => Math.max(count-1, 0))  // -1 이 나오지않게 최소값 0으로 설정

    return [count, incrementCount, decrementCount]
}

export default useCounter;