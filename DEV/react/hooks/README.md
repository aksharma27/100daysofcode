# Getting Started with Create React App

# React Hooks: 
1) import hooks from react - import React, {useState} from 'react';
2)the hooks can only be called inside the react func component, and define it at the top level of the function : 

const UseState = () =>{
const [count, setCount] = useState(0);
}

3) hooks cannot be conditional
# Types of hooks in react : 
# ** whenever a hooks data is changed, it completely rerenders the whole component
1- useState
2- useEffect : data fetching through apis, setting of a subscription, manually setting dom of react components
                eg :  notifications numbers 
        Syntax: 
        useEffect( () => {code for sideffects}, [dependency array(optional)] )

