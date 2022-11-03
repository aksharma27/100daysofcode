import Link from "next/link"
import { useRouter } from "next/router"
import { useEffect } from "react";

const ErrorPage = () => {
  const router = useRouter();
  const handleError = () =>{
    router.push("./");
  }

  useEffect (()=>{
    setTimeout(() =>{
      router.push("./");
    }, 3000);
   }, []);


  return (
    <div>
      <h1>404</h1>
      <h2>We are sorry, Page not found</h2>
      <Link href="./">go to home</Link>
      <button>
        <a onClick={handleError} >Go back to home</a>
      </button>
    </div>
  )
}

export default ErrorPage
