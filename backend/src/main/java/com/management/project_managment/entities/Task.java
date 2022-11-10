package com.management.project_managment.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.management.project_managment.enums.Status;

@Entity
@Table(name = "tb_task")
public class Task implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(columnDefinition = "TEXT")
	private String description;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")	
	private Date dataInitial;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")	
	private Date dueData;
	private Status status;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;
	
	
	public Task() {
	
	}

	public Task(Long id, String name, String description, Date dataInitial, Date dueData, Status status, User user,
			Project project) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.dataInitial = dataInitial;
		this.dueData = dueData;
		this.status = status;
		this.user = user;
		this.project = project;
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
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Task other = (Task) obj;
		return Objects.equals(id, other.id);
	}
}
