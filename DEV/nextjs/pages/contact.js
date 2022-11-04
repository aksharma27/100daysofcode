// import React from 'react'
import styles from "../styles/contact.module.css";
import Image from "next/image";
import Head from "next/head";

const contact = () => {
  return (

   

    <div style={{textAlign:"center"}}>

        <style jsx>
            {`
                h1{
                    text-align: center;
                }
            `}
        </style>
        <Head>
      <title>Contact page</title>
    </Head>

        <Image src="/abhishek.jpg" width="200" height="200" ></Image>
        <Image src="https://images.unsplash.com/photo-1661956602868-6ae368943878?ixlib=rb-4.0.3&ixid=MnwxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80"
        width="250" height="200"
         alt="aboutImage"></Image>

      <h1 className={styles.heading1}>Hello to contact page</h1>
      <h2 style={{color: "#fff", textAlign:"center"}}>Hello inline</h2>
    </div>
  )
}

export default contact
