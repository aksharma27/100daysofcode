import React from 'react'

const Redux = () => {
    return (
        <div>
            <div className="container">
                <h1>Increment/Decrement counter</h1>
                <h4>using React and Redux</h4>

                <div className="quantity">
                    <a href="" title='decrement' className="quantity_minus"><span>-</span></a>
                    <input type="text" name="quantity" className='quantity_input' value="0" />
                    <a href="" title='increment' className="quantity_plus"><span>+</span></a>
                </div>
            </div>
        </div>
    )
}

export default Redux
