import './styles.css';

import Project from 'assets/img/project.png';
import Client from 'assets/img/client.png';
import Task from 'assets/img/task.png';
import Teams from 'assets/img/teams.png';

function Sidebar2() {
  return (
    <>
      <div className="menu-btn">
        <i className="fas fa-bars"></i>
      </div>
      <div className="side-bar active">
        <div className="close-btn">
          <i className="fas fa-times"></i>
        </div>
        <div className="menu ">
          <div className="item">
            <a href="/login">
              <img src={Project} alt="Project" />
              <i className="fas fa-desktop "></i>Projects    </a>        
          </div>
          <div className="item"></div>
          <div className="item">
            <a href="index.html">
              <img src={Task} alt="Task" />
              <i className="fas fa-th"></i>Task
            </a>
          </div>
          <div className="item"></div>
          <div className="item">
            <a href="index.html">
              <img src={Client} alt="Client" />
              <i className="fas fa-info-circle"></i>Clients
            </a>
          </div>

          <div className="item"></div>
          <div className="item">
            <a href="index.html">
              <img src={Teams} alt="teams" />
              <i className="fas fa-info-circle"></i>Teams
            </a>
          </div>
        </div>
      </div>
    </>
  );
}

export default Sidebar2;
