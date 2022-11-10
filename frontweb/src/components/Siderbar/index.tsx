import './styles.css';
import './sidebar.js';

import Project from 'assets/img/project.png';
import Client from 'assets/img/client.png';
import Task from 'assets/img/task.png';
import Teams from 'assets/img/teams.png';
import Drop from 'assets/img/drop.png';
import Arrow from 'assets/img/arrow.png';

function Sidebar() {

  return (
    <>
    <div className='navmain'>
      <div className="sidenav">
        <div className="menu">
          <a href="#about">
            <img src={Drop} alt="Drop" /> Menu
          </a>
        </div>
        <a href="#services">
          <img src={Project} alt="Project" /> Projects
        </a>
        <a href="#clients">
          <img src={Task} alt="Task" /> Task
        </a>
        <a href="#contact">
          <img src={Teams} alt="teams" />
          Teams
        </a>
        <button className="dropdown-btn">
          <img src={Drop} alt="Drop" /> Dropdown{' '}
          <img src={Arrow} alt="Arrow" id="arrow" />
          <i className="fa fa-caret-down"></i>
        </button>
        <div className="dropdown-container">
          <a href="/">Link 1</a>
          <a href="/">Link 2</a>
          <a href="/">Link 3</a>
        </div>
        <a href="#contact">
          {' '}
          <img src={Client} alt="Client" /> Clients
        </a>
      </div>
      </div>
    </>
  );
}

export default Sidebar;
