package com.rest.finance.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;

@Entity
public class Employee implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	private String secondName;
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
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", secondName=" + secondName + "]";
	}
	
	

}
