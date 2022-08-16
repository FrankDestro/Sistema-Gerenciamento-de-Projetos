package com.management.project_managment.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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
@Table(name = "tb_project")
public class Project implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(columnDefinition = "TEXT")
	private String description;
	private Date initialDate;
	private Date dueData;
	@Enumerated(EnumType.STRING)
	private Status status;
	private String imgUrl;
	private Double budget;
	private Double expenses;
	private Double invoicing;
	private String owner;
	
	@OneToMany(mappedBy = "project")
	private List<Task> tasks = new ArrayList<>();
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public Project() {
	}

	public Project(Long id, String name, String description, Date initialDate, Date dueData, Status status,
			String imgUrl, Double budget, Double expenses, Double invoicing, String owner) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.initialDate = initialDate;
		this.dueData = dueData;
		this.status = status;
		this.imgUrl = imgUrl;
		this.budget = budget;
		this.expenses = expenses;
		this.invoicing = invoicing;
		this.owner = owner;
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

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public Double getExpenses() {
		return expenses;
	}

	public void setExpenses(Double expenses) {
		this.expenses = expenses;
	}

	public Double getInvoicing() {
		return invoicing;
	}

	public void setInvoicing(Double invoicing) {
		this.invoicing = invoicing;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public List<Task> getTasks() {
		return tasks;
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
		Project other = (Project) obj;
		return Objects.equals(id, other.id);
	}

}
