package com.devsuperior.atividade.modulo1.backendm1.dto;

import java.io.Serializable;
import java.time.Instant;

import com.devsuperior.atividade.modulo1.backendm1.entities.Client;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class ClientDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	@JsonIgnore
	private Long id;
	
	private String name;
	private String cpf;
	private Double income;
	private Instant birthDate;
	private Integer children;
	
	public ClientDTO(String name, String cpf, Double income, Instant birthDate, Integer children) {
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client client) {
		this.id = client.getId();
		this.name = client.getName();
		this.cpf = client.getCpf();
		this.income = client.getIncome();
		this.birthDate = client.getBirthDate();
		this.children = client.getChildren();
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public Instant getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Instant birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}	

}
