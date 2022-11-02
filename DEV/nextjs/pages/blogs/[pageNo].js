import { useRouter } from "next/router"

const pageNo = () => {
    const router = useRouter();
    const pNo = router.query.pageNo;

  return ( 
    <div>
      <h1>My {pNo} Content</h1>
    </div>
  )
}

export default pageNo
