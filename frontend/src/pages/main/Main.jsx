import React from 'react';
import Navbar from '../../components/navbar/Navbar';
import Sidenav from '../../components/sidenav/Sidenav';
import './main.sass';

function Main() {
  return (
    <div>
      <Navbar/>
      <Sidenav/>
    </div>
  );
}

export default Main;
