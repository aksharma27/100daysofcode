import { useState, useEffect } from 'react'
import reactLogo from './assets/react.svg'
import './App.css'
import axios from "axios";

function App() {
  const [myData, setData] = useState([]);


  //using promises
  useEffect(() => {
    axios.get("https://jsonplaceholder.typicode.com/posts")
      .then((res) =>
        setData(res.data)
      );
  }, [])

  return (
    <h2>Axios</h2>

  )
}

export default App
