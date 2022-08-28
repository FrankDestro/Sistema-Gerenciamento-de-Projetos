package com.management.project_managment.entities.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.management.project_managment.entities.Project;
import com.management.project_managment.entities.User;

@Embeddable
public class AllocationPK implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;

	public AllocationPK() {
		
	}	
	
	public AllocationPK(User user, Project project) {
		this.user = user;
		this.project = project;
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
		return Objects.hash(project, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AllocationPK other = (AllocationPK) obj;
		return Objects.equals(project, other.project) && Objects.equals(user, other.user);
	}

}
