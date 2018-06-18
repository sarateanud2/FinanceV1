package com.rest.finance.entitys;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
//@Table(name="addedmoney")
public class AddedMoney implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private Double sumaDeBani;
	
	
	@Temporal(TemporalType.DATE)
	private Calendar dataPrimirii;
	
	@ManyToOne
	@JoinColumn(name="sources")
//	@JsonIgnore
	private SourceOfAddedMoney sourceOfAddedMoney;
	
	@ManyToOne
	@JoinColumn(name="valuta")
	private Valuta valuta;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getSumaDeBani() {
		return sumaDeBani;
	}

	public void setSumaDeBani(Double sumaDeBani) {
		this.sumaDeBani = sumaDeBani;
	}

	public Calendar getDataPrimirii() {
		return dataPrimirii;
	}

	public void setDataPrimirii(Calendar dataPrimirii) {
		this.dataPrimirii = dataPrimirii;
	}

	public SourceOfAddedMoney getSourceOfAddedMoney() {
		return sourceOfAddedMoney;
	}

	public void setSourceOfAddedMoney(SourceOfAddedMoney sourceOfAddedMoney) {
		this.sourceOfAddedMoney = sourceOfAddedMoney;
	}

	public Valuta getValuta() {
		return valuta;
	}

	public void setValuta(Valuta valuta) {
		this.valuta = valuta;
	}
	
	
}
