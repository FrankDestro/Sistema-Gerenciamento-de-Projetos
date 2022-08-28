package com.management.project_managment.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.management.project_managment.entities.pk.AllocationPK;

@Entity
@Table(name = "tb_allocation")
public class Allocation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private AllocationPK id = new AllocationPK();
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant MomentAllocation;
	
	private Integer workLoad;

	public Allocation() { 
	}

	public Allocation(User user, Project project, Instant momentAllocation, Integer workLoad) {
		id.setUser(user);
		id.setProject(project);
		this.MomentAllocation = momentAllocation;
		this.workLoad = workLoad;
	}

	public AllocationPK getId() {
		return id;
	}

	public void setId(AllocationPK id) {
		this.id = id;
	}

	public Instant getMomentAllocation() {
		return MomentAllocation;
	}

	public void setMomentAllocation(Instant momentAllocation) {
		MomentAllocation = momentAllocation;
	}

	public Integer getWorkLoad() {
		return workLoad;
	}

	public void setWorkLoad(Integer workLoad) {
		this.workLoad = workLoad;
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
		Allocation other = (Allocation) obj;
		return Objects.equals(id, other.id);
	}
}
