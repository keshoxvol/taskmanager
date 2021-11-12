import React, { useEffect, useState } from 'react';
import {Localbar} from '../../components/localbar';
import {Sidebar} from '../../components/sidebar';
import {GetAll} from '../../api/services/task.service'

export const Main = () =>{

const [Tasks, setTasks] = useState([])

  useEffect(()=>{
    GetAll().then(response => setTasks(response))
  },[])

  return (
    <>
      <Sidebar/>
      <div style={{width: '100%'}}>
        <Localbar/>
        <div id='content'>
          <div className="tasks__list">
            {Tasks.map(task => 
              <span>
                <p>{task.id}</p>
                <p>{task.title}</p>
              </span>
            )}
          </div>
        </div>
      </div>
    </>
  )
}