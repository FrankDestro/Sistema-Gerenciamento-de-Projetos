package com.management.project_managment.dto;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.management.project_managment.entities.Task;
import com.management.project_managment.enums.Status;

public class TaskDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	@Size(min = 5, max = 60, message = "Deve ter entre 5 e 60 caracteres")
	@NotBlank(message = "Campo requerido")
	private String name;
	@Size(min = 5, max = 250, message = "Deve ter entre 5 e 250 caracteres")
	@NotBlank(message = "Campo requerido")
	private String description;
	@FutureOrPresent(message = "Colocar uma data presente ou futura")
	private Date dataInitial;
	@FutureOrPresent(message = "Colocar uma data presente ou futura")
	private Date dueData;
	private Status status;
	private Long userId;
	private String userName;
	private Long projectId;
	private String projectName;
	
	public TaskDTO() {
	}

	public TaskDTO(Long id, String name, String description, Date dataInitial, Date dueData, Status status, Long userId,
			String userName, Long projectId, String projectName) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.dataInitial = dataInitial;
		this.dueData = dueData;
		this.status = status;
		this.userId = userId;
		this.userName = userName;
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public TaskDTO(Task entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		dataInitial = entity.getDataInitial();
		dueData = entity.getDueData();
		status = entity.getStatus();
		userId = entity.getUser().getId();
		userName = entity.getUser().getFirstName();
		projectId = entity.getProject().getId();
		projectName = entity.getProject().getName();
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDataInitial() {
		return dataInitial;
	}

	public void setDataInitial(Date dataInitial) {
		this.dataInitial = dataInitial;
	}

	public Date getDueData() {
		return dueData;
	}

	public void setDueData(Date dueData) {
		this.dueData = dueData;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
}
