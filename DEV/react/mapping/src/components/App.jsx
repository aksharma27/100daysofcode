import React from 'react'
import Entry from './Entry'
import '../App.css';

const App = () => {
    return (
        <div>
            <h1>Emojipedia</h1>
            <dl className="dictionary">
                <Entry />
                <Entry />
                <Entry />
            </dl>
        </div>
    )
}

export default App
