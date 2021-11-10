import React from 'react';
import Navbar from '../../components/navbar';
import Sidenav from '../../components/sidenav';
import Taskpanel from '../../components/taskpanel';

export const Main = () =>{
  return (
    <div className='mainpage'>
      <Navbar/>
      <Sidenav/>
      <Taskpanel/>
    </div>
  )
}

export default Main;
