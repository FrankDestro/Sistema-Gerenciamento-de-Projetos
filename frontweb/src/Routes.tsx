import Navbar from 'components/Navbar';
import { BrowserRouter, Route, Switch } from 'react-router-dom';
import Login from 'pages/Login';
import Project from 'pages/Projects';
import ProjectDetails from 'pages/ProjectDetails';
import Sidebar2 from 'components/Siderbar2';

const Routes = () => {
  return (
    <BrowserRouter>
      <Switch>
        <Route path="/login" exact>
          <Login />
        </Route>

        <Route path="/projects">
          <Navbar></Navbar>
          <div className="main">
          <Sidebar2/>
            <Project></Project>
          </div>
        </Route>

        <Route path="/projectdetails">
          <Navbar></Navbar>
          <div className="main">
          <Sidebar2/>
            <ProjectDetails />
          </div>
        </Route>
      </Switch>
    </BrowserRouter>
  );
};

export default Routes;
