package com.management.project_managment.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

import com.management.project_managment.entities.Client;
import com.management.project_managment.entities.Project;
import com.management.project_managment.entities.Task;
import com.management.project_managment.enums.Status;

public class ProjectDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	@Size(min = 5, max = 60, message = "Deve ter entre 5 e 60 caracteres")
	@NotBlank(message = "Campo requerido")
	private String name;
	@NotBlank(message = "Campo requerido")
	private String description;
	@FutureOrPresent(message = "Colocar uma data presente ou futura")
	private Date initialDate;
	@Future(message = "Colocar uma data futura")
	private Date dueData;
	@NotBlank(message = "Campo requerido")
	private Status status;
	@NotBlank(message = "Campo requerido")
	private String imgUrl;
	@Positive(message = "Budget deve ser um valor positivo")
	private String smart;
	@PositiveOrZero(message = "Colocar um numero positivo ou zero")
	private String premises;
	@PositiveOrZero(message = "Colocar um numero positivo ou zero")
	private String risks;
	@NotBlank(message = "Campo requerido")
	private String resources;
	@NotBlank(message = "Campo requerido")
	private Double budget;
	@NotBlank(message = "Campo requerido")
	private Double expenses;
	@NotBlank(message = "Campo requerido")
	private Double invoicing;
	@NotBlank(message = "Campo requerido")
	private String owner;
	@NotBlank(message = "Campo requerido")
	private String category;
	@NotBlank(message = "Campo requerido")
	private Long client;
	private String clientName;
			
	Set<TaskDTO> tasks = new HashSet<>();
	
	private int quanttasks = tasks.size();
	
	public ProjectDTO(Long id,
			String name, String description, Date initialDate, Date dueData, Status status, String imgUrl,String smart, String premises, String risks, String resources, Double budget, Double expenses, Double invoicing, String owner, String category, Long client,
			String clientName) {
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
		this.clientName = clientName;
		
	}

	public ProjectDTO(Project entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		initialDate = entity.getInitialDate();
		dueData = entity.getDueData();
		status = entity.getStatus();
		imgUrl = entity.getImgUrl();
		smart = entity.getSmart();
		premises = entity.getPremises();
		risks = entity.getRisks();
		resources = entity.getResources();
		budget = entity.getBudget();
		expenses = entity.getExpenses();
		invoicing = entity.getInvoicing();
		owner = entity.getOwner();
		category = entity.getCategory();
		client = entity.getClient().getId();
		clientName = entity.getClient().getName();
		entity.getTasks().forEach(tk -> this.tasks.add(new TaskDTO(tk)));
		
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

	public Long getClient() {
		return client;
	}

	public void setClient(Long client) {
		this.client = client;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Set<TaskDTO> getTasks() {
		return tasks;
	}

	public int getQuanttasks() {
		return quanttasks;
	}

}
