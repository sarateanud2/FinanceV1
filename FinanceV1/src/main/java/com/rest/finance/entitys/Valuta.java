package com.rest.finance.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Valuta implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String Valuta;
	
	@OneToMany(mappedBy="valuta", cascade=CascadeType.ALL, orphanRemoval=true)
	@JsonIgnore
	private List<AddedMoney> addedMoneys;
	
	@OneToMany(mappedBy="valuta", cascade=CascadeType.ALL, orphanRemoval=true)
	@JsonIgnore
	private List<SumaCurenta> sumaCurenta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getValuta() {
		return Valuta;
	}

	public void setValuta(String valuta) {
		Valuta = valuta;
	}

	public List<AddedMoney> getAddedMoneys() {
		return addedMoneys;
	}

	public void setAddedMoneys(List<AddedMoney> addedMoneys) {
		this.addedMoneys = addedMoneys;
	}
	

}
