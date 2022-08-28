package com.management.project_managment.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.project_managment.dto.ProjectDTO;
import com.management.project_managment.services.ProjectService;

@RestController
@RequestMapping(value = "/projects")
public class ProjectResource {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping
	public ResponseEntity<Page<ProjectDTO>> findAll(Pageable pageable) {
		Page<ProjectDTO> list = projectService.findAllProjects(pageable);		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<ProjectDTO> findById(@PathVariable Long id) {
		ProjectDTO dto = projectService.findById(id);
		return ResponseEntity.ok().body(dto);
	}
	
}
