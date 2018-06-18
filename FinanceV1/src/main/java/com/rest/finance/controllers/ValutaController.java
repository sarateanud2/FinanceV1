package com.rest.finance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.finance.entitys.Valuta;
import com.rest.finance.services.ValutServices;

@RestController
@CrossOrigin("*")
public class ValutaController {

	@Autowired
	private ValutServices valutServices;
	
	@RequestMapping("/valuta")
	@CrossOrigin("*")
	public List<Valuta> findAllValuta(){
		return this.valutServices.findAllValuta();
	}
	
	@RequestMapping(value="/valuta", method= RequestMethod.POST)
	public void saveValuta(@RequestBody Valuta valuta) {
		this.valutServices.saveValuta(valuta);
	}
}
