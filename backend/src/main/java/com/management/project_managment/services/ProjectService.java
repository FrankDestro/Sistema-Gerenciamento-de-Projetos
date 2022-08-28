package com.management.project_managment.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.project_managment.dto.ProjectDTO;
import com.management.project_managment.entities.Project;
import com.management.project_managment.repositories.ProjectRepository;
import com.management.project_managment.services.exceptions.ResourceNotFoundException;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Transactional(readOnly=true)
	public Page<ProjectDTO> findAllProjects(Pageable pageable){
		Page<Project> list = projectRepository.findAll(pageable);
		return list.map(x -> new ProjectDTO(x));
	}
	
	@Transactional(readOnly = true)
	public ProjectDTO findById(Long id) {
		Optional<Project> obj = projectRepository.findById(id);
		Project entity = obj.orElseThrow(() -> new ResourceNotFoundException("Project not found"));
		return new ProjectDTO(entity);
	}
	

}
