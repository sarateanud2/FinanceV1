package com.rest.finance.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@Table(name="sourceofaddedmoney")
public class SourceOfAddedMoney implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String sourceName;
	
	@OneToMany(mappedBy="sourceOfAddedMoney", cascade=CascadeType.ALL, orphanRemoval=true)
	@JsonIgnore
	private List<AddedMoney> addedMoney;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public List<AddedMoney> getAddedMoney() {
		return addedMoney;
	}

	public void setAddedMoney(List<AddedMoney> addedMoney) {
		this.addedMoney = addedMoney;
	}
	
	
}
