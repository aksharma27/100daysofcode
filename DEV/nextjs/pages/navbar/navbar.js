
import  Link  from "next/link";
const navbar = () => {
  return (
    <div>
        <nav>
            <ul className="menu-bar">
                <li>
                    <Link href="/">Home</Link>
                </li>
                <li>
                    <Link href="./home">page</Link>
                </li>
                <li>
                    <Link href="/">Home</Link>
                </li>
                <li>
                    <Link href="/">Home</Link>
                </li>
                <li>
                    <Link href="/">Home</Link>
                </li>
            </ul>
        </nav>


      <header className="header">
        <div className="brand_box">
            <div className="text_box">
                <h1 className="heading_primary">
                    
                <span className="heading_primary_MAIN">
                    Welcome to the world of React JS
                </span>
                <span>Love with JS</span>
                </h1>
                <a    className="btn btn_white btn_animated" >
                    Abhishek Industries
                </a>
            </div>
        </div>
      </header>
    </div>
  )
}

export default navbar
