package com.rest.finance.entitys;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SumaCurenta implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Double sumaCurenta;
	
	@ManyToOne
	@JoinColumn(name="valuta")
	private Valuta valuta;
	
	public SumaCurenta() {
		super();
	}

	public SumaCurenta(Double sumaCurenta, Valuta valuta) {
		super();
		this.sumaCurenta = sumaCurenta;
		this.valuta = valuta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSumaCurenta() {
		return sumaCurenta;
	}

	public void setSumaCurenta(Double sumaCurenta) {
		this.sumaCurenta = sumaCurenta;
	}

	public Valuta getValuta() {
		return valuta;
	}

	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	
	
	
}
