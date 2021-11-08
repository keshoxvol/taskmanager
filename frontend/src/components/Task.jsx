import { useState } from "react";
import taskimage from './images/taskimage.png';
import './css/task.css';

function Task(){
    return(
        <div>
            <img src={taskimage} className="taskimage" alt=''/>
        </div>
    );
}
export default Task;