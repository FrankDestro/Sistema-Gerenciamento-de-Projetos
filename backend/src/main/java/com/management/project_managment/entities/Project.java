package com.management.project_managment.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	// @Enumerated(EnumType.STRING)
	private Status status;
	private String imgUrl;
	@Column(columnDefinition = "TEXT")
	private String smart;
	@Column(columnDefinition = "TEXT")
	private String premises;
	@Column(columnDefinition = "TEXT")
	private String risks;
	@Column(columnDefinition = "TEXT")
	private String resources;
	private Double budget;
	private Double expenses;
	private Double invoicing;
	@Column(columnDefinition = "TEXT")
	private String owner;
	@Column(columnDefinition = "TEXT")
	private String category;

	@OneToMany(mappedBy = "project")
	private Set<Task> tasks = new HashSet<>();

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	public Project() {
	}

	public Project(Long id, String name, String description, Date initialDate, Date dueData, Status status,
			String imgUrl, String smart, String premises, String risks, String resources, Double budget,
			Double expenses, Double invoicing, String owner, String category, Client client) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.initialDate = initialDate;
		this.dueData = dueData;
		this.status = status;
		this.imgUrl = imgUrl;
		this.smart = smart;
		this.premises = premises;
		this.risks = risks;
		this.resources = resources;
		this.budget = budget;
		this.expenses = expenses;
		this.invoicing = invoicing;
		this.owner = owner;
		this.category = category;
		this.client = client;
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

	public String getSmart() {
		return smart;
	}

	public void setSmart(String smart) {
		this.smart = smart;
	}

	public String getPremises() {
		return premises;
	}

	public void setPremises(String premises) {
		this.premises = premises;
	}

	public String getRisks() {
		return risks;
	}

	public void setRisks(String risks) {
		this.risks = risks;
	}

	public String getResources() {
		return resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Task> getTasks() {
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
