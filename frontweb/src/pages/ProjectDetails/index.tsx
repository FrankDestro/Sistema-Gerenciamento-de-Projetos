import './styles.css';

function ProjectDetails() {
  return (
    <div className="container my-4">

      <div className="projectdetails-options">
        <p> Projetos </p>
        <div className="projectdetails-button">
          Editar projeto / Fechar projeto
        </div>
      </div>

      <div className="base-card project-details-content">
        <div className="projectdetails-description">
          <h1> Shell </h1>
        </div>

        <div className="projectdetails-chart">Chart</div>
      </div>
      
    </div>
  );
}

export default ProjectDetails;
