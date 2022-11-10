import './styles.css';

import logoMain from 'assets/img/logo.png';
import Profile from 'assets/img/profile.png';
import Notification from 'assets/img/notification.png';
import Logout from 'assets/img/logout.png';
import SeetingsPerfil from 'assets/img/seetings.png';

function Navbar() {
  return (
    <nav className="navbar navbar-expand-md navbar-dark bg-primary main-nav">
      <div className="container-logo">
        <img src={logoMain} alt="Logo Main" />
        <a href="/" className="nav-logo-text">
          <h4>Goofrikten</h4>
        </a>
      </div>

      <div className="collapse navbar-collapse container-user-navbar">
        <ul className="navbar-nav offset-md-10 main-menu">
          <li>
            <div className="dropdown">
              <img src={Notification} alt="notification" />
              <div className="dropdown-content">
                <a href="#">Ver todas as notificações</a>
              </div>
            </div>
          </li>

          <li>
            <div className="dropdown">
              <img src={Profile} alt="profile" />
              <div className="dropdown-content">
                <a href="#"> <img src={SeetingsPerfil} alt="SeetingsPerfil" /> Account Seetings </a>
                <a href="#"> <img src={Logout} alt="Logout" /> Logout </a>
              </div>
            </div>
          </li>
        </ul>
      </div>
    </nav>
  );
}

export default Navbar;
