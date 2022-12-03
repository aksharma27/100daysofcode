//import store from redux to create a store
import {createStore} from "redux";


import rootReducer from "./reducer/index";

const  store = createStore(rootReducer);        //store is our centralized/global state

export default store;