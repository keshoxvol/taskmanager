import { useState } from "react";
import './css/navbar.css';
import navbarimage from './images/navbar.png';

function Navbar(){
    return(
        <div className='navbar'>
            <img src={navbarimage} className="navbarimage" alt=''/>
            <div className="statuspanel"> Все | Ожидание | В работе | Выполнено </div>
        </div>
    );
}
export default Navbar;