package com.management.project_managment.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.project_managment.dto.TaskDTO;
import com.management.project_managment.dto.UserDTO;
import com.management.project_managment.services.TaskService;

@RestController
@RequestMapping(value = "/tasks")
public class TaskResource {

	@Autowired
	private TaskService taskService;
	
	@GetMapping
	public ResponseEntity<Page<TaskDTO>> findAllTask(Pageable pageable) {
		Page<TaskDTO> list = taskService.findAllTask(pageable);		
		return ResponseEntity.ok().body(list);
	}
}
