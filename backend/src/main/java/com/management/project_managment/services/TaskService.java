package com.management.project_managment.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.management.project_managment.dto.TaskDTO;
import com.management.project_managment.entities.Task;
import com.management.project_managment.repositories.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@Transactional(readOnly=true)
	public Page<TaskDTO> findAllTask(Pageable pageable){
		Page<Task> list = taskRepository.findAll(pageable);
		return list.map(x -> new TaskDTO(x));
	}
	
	

}
 