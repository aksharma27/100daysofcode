import React from 'react'

const Entry = (props) => {
    return (
        <div className='term' >
            <dt>
                <span className="emoji" role="img" aria-label='Tense Biceps'>
                    {/* 💪 */}
                    {props.emoji}
                </span>
                {/* <span>Tense Biceps</span> */}
                <span>{props.name} </span>
            </dt>

            <dd>
                {/* "You can do that or I feel strong!" Arm with tense biceps. Also used in connection with doing sports. e.g. at the gym. */}
                {props.desctiption}
            </dd>
        </div>
    )
}

export default Entry
