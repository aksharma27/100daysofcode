import navbar from "../navbar/navbar";

export const getStaticProps = async () =>{
    const res = await fetch("https://jsonplaceholder.typecode.com/posts");
    const data = await res.json();  // convert the data to json so that it's in an object to readable format

    //object ko return karwana hi hoga
    return {
        props: {
            //pass the data object created by res.json
            data,
        },
    };
};  

const blogs = ({data}) =>{
    return (
        <>
        <navbar/>
        
        {data.map((curElement) => {
            return <div key={curElement.id}> 
            <h2>{curElement.id}</h2>
            <h3>{curElement.title}</h3>
            </div>
        })}
        </>
    );
}

export default blogs;