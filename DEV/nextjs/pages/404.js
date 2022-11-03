import Link from "next/link"

const ErrorPage = () => {
  return (
    <div>
      <h1>404</h1>
      <h2>We are sorry, Page not found</h2>
      <Link href="./">go to home</Link>
    </div>
  )
}

export default ErrorPage
