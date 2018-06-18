package com.rest.finance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.finance.entitys.Valuta;
import com.rest.finance.resourcesinterfaces.ValutaRepository;

@Service
public class ValutServices {
	
	@Autowired
	private ValutaRepository valutaRepository;
	
	public List<Valuta> findAllValuta(){
		List<Valuta> valutaList = new ArrayList<>();
		this.valutaRepository.findAll().forEach(valutaList::add);
		
		return valutaList;
	}
	
	public void saveValuta(Valuta valuta) {
		this.valutaRepository.save(valuta);
	}
}
