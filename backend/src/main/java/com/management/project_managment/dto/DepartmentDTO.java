package com.management.project_managment.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import com.management.project_managment.entities.Department;
import com.management.project_managment.entities.User;

public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	private Set<UserDTO> employees = new HashSet<>();
	
	public DepartmentDTO() {
	}
	
	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
		entity.getEmployees().forEach(emp -> this.employees.add(new UserDTO(emp)));
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserDTO> getEmployees() {
		return employees;
	}
}
