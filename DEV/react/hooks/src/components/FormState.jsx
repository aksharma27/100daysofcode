import React, { useState } from 'react'

const FormState = () => {
    const [formData, setFormData] = useState({
        name: "",
        mail: "",
        password: "",
        passwordcnf: ""
    });

    const handleInput = (event) => {
        const name = event.target.name;
        const value = event.target.value;
        console.log(name, value)
    }


    return (
        <div>
            <form action="">
                <input type="text" placeholder='username' id='name' name='name' value={formData.name} onChange={handleInput} />
                <input type="email" placeholder='email' id='mail' name='mail' value={formData.mail} onChange={handleInput} />
                <input type="password" placeholder='password' id='pass' name='password' value={formData.password} onChange={handleInput} />
                <input type="password" placeholder='confirm password' id='passcnf' name='passwordcnf' onChange={handleInput} />
            </form>
        </div>
    )
}

export default FormState
