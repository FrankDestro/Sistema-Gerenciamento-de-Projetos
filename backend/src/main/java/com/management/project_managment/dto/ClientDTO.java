package com.management.project_managment.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.management.project_managment.entities.Client;

public class ClientDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String city;
	private String country;
	private String address;
	private Long zip;
	private String marketSegment;

	private List<ProjectDTO> projects = new ArrayList<>();

	public ClientDTO() {
	}

	public ClientDTO(Long id, String name, String city, String country, String address, Long zip,
			String marketSegment) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.country = country;
		this.address = address;
		this.zip = zip;
		this.marketSegment = marketSegment;
	}

	public ClientDTO (Client entity) {
		id = entity.getId();
		name = entity.getName();		
		city = entity.getCity();
		country = entity.getCountry();
		address = entity.getAddress();
		zip = entity.getZip();
		marketSegment = entity.getMarketSegment();
		entity.getProjects().forEach(projects -> this.projects.add(new ProjectDTO(projects)));			
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}
	
	public String getMarketSegment() {
		return marketSegment;
	}

	public void setMarketSegment(String marketSegment) {
		this.marketSegment = marketSegment;
	}

	public List<ProjectDTO> getProjects() {
		return projects;
	}
}
