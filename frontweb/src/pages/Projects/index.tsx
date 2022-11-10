import './styles.css';

import IconProject from 'assets/img/buscar-projeto.png';
import { Project } from 'types/project';
import ProjectCard from 'components/ProjectCard';
import Pagination from 'components/Pagination';

const Projects = () => {
  const project: Project = {
    id: 1,
    name: 'Yamp system',
    description:
      'O projeto consiste em desenvolver um sistema de e-commerce para a empresa de varejo YANMP que está iniciando as atividades no brasil, o sistema irá suportar as 12 unidades presentes em diferentes cidades e estados do pais.',
    initialDate: '2022-11-02T03:00:00.000+0d0:00',
    dueData: '2023-05-25T03:00:00.000+00:00',
    status: 'OPEN',
    imgUrl: 'https://raw.githubusercontent.com/FrankDestro/Sistema-Gerenciamento-de-Projetos/main/project-logo.png',
    smart:
      'Automatizar o processo de vendas que antes era em lojas físicas para e-commerce para redução de custos, e alcançar um público alvo maior não apenas nas filiais físicas presentes, e melhorar o processo de logística centralizando todas as vendas em um único sistema integrado.',
    premises:
      'Utilização das tecnologias Web para maior disponibilidade, o início do projeto deverá ocorrer na data estipulada 02/11/2022 com previsão de termino para 25/05/2023. Será alocada equipe interna para desenvolvimento, caso necessário será contratada uma empresa terceirizada para agilizar o desenvolvimento.',
    risks:
      'Atraso no desenvolvimento do projeto que pode acarretar aumento nos custos do projeto, indisponibilidade da plataforma de desenvolvimento, faltas dos funcionários alocados no projeto, mão de obra não especializada.',
    resources:
      '4 desenvolvedores pleno na linguagem Java, 2 arquitetos de cloud AWS, 2 desenvolvedores junior linguagem java, 2 desenvolvedores plenos front-end.',
    budget: 13000.0,
    expenses: 17000.0,
    invoicing: 28560.0,
    owner: 'Gerente de projetos Junior Marcos de Oliveira Neto',
    category: 'Sistema',
    client: 4,
    clientName: 'INBEACH',
    tasks: [
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
      {
        id: 30,
        name: 'Efetuar o mergepull',
        description: 'configurar o arquivos de variaveis',
        dataInitial: '2022-08-22T03:00:00.000+00:00',
        dueData: '2022-08-29T03:00:00.000+00:00',
        status: 'FINISHED',
        userId: 3,
        userName: 'Alex',
        projectId: 1,
        projectName: 'Sistema e-commerce yanmp',
      },
    ],
  };

  return (
    <div className="container my-4">
      <div className="icon-card">
        <img src={IconProject} alt="Project" />
        <p> Projetos </p>
      </div>

      <div className="search-card">
        <p> Buscar </p>
      </div>

      <div className="row">
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
        <div className="col-sm-6 col-lg-4 col-xl-3">
          <ProjectCard project={project} />
        </div>
      </div>
      <Pagination></Pagination>
    </div>

    
  );
};

export default Projects;
