package com.rest.finance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rest.finance.entitys.SumaCurenta;
import com.rest.finance.services.SumaCurentaService;

@RestController
public class SumaCurentaController {

	@Autowired
	private SumaCurentaService curentaService;
	
	@RequestMapping("/sumacurenta")
	public List<SumaCurenta> findAllSumeCurente(){
		return this.curentaService.findAllSumeCurente();
	}
	
	
}
