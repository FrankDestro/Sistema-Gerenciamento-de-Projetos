import ButtonDetails from 'components/ButtonDetails';
import {Project} from 'types/project';
import { formatBudget } from 'util/formatters';

import './styles.css';

type Props = {
  project : Project;
}


const ProjectCard = ({project} : Props) => {
  return (
    <div className="product-card">
      <div className="card-top-container">
        <img src={project.imgUrl} alt="Nome do produto" />
      </div>

      <div className="card-bottom-container">
        <div className="left-container">
          <div className="name-project">
            <p>{project.name}</p>
          </div>

          <div className="information-project">
            <p>Progress</p>
            <p>Task {project.tasks.length}</p>
            <p>Budget {formatBudget(project.budget)}</p>
          </div>
        </div>

        <div className="right-container">
          <div className="deadline-project">
            <p>Deadline </p>
            <p>{project.dueData}</p>
          </div>
        </div>
      </div>
      <ButtonDetails />
    </div>
  );
}


export default ProjectCard;
