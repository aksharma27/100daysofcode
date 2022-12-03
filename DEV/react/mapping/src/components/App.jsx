import React from 'react'
import Entry from './Entry'
import '../App.css';
import emojipedia from '../emojipedia';


function createEntry(emojiTerm) {
    return <Entry
        key={emojiTerm.id}
        emojie={emojiTerm.emoji}
        name={emojiTerm.name}
        description={emojiTerm.meaning}
    />
}


const App = () => {
    return (
        <div>
            <h1>Emojipedia</h1>
            <dl className="dictionary">
                {emojipedia.map()}
            </dl>
        </div>
    )
}

export default App
