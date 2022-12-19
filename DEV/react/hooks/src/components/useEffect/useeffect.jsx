import React, { useEffect, useState } from 'react'

const UseEffect = () => {
    const [count, setCount] = useState(0);
    const countUpdate = (val) => {
        if (val === "inc") return setCount(count + 1);
        if (val === "dec") return setCount(count - 1);
    };
    useEffect(() => {
        document.title = count
    })
    return (

        <div >
            <button onClick={() => {
                countUpdate("inc")
            }}> +

            </button >
            <h1>{count} </h1>
            <button onClick={() => (count === 0 ? setCount(0) : countUpdate("dec"))}>-</button>
        </div >
    )
}

export default UseEffect
