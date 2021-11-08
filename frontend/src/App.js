import React from 'react';
import Counter from './components/Counter';
import Navbar from './components/Navbar';
import Task from './components/Task';
import './components/css/main.css';

function App() {
  return (
    <div className='center'>
      <Navbar/>
      <Task/>
    </div>
  );
}

export default App;
