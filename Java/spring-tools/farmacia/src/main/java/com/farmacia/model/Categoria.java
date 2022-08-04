package com.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="tb_categoria")
public class Categoria {

	@Id
	@Autowired
	private Long id;
	
	@Size(min = 3, max = 100)
	private String remedio;
	
	@Size(min = 3, max = 100)
	private String Higiene;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRemedio() {
		return remedio;
	}

	public void setRemedio(String remedio) {
		this.remedio = remedio;
	}

	public String getHigiene() {
		return Higiene;
	}

	public void setHigiene(String higiene) {
		Higiene = higiene;
	}
	
	
}
