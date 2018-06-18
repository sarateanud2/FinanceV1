package com.rest.finance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.finance.entitys.SourceOfAddedMoney;
import com.rest.finance.services.SourcesOfAddedMoneyServices;

@RestController
@CrossOrigin("*")
public class SourcesOfAddedMoneyController {
	
	@Autowired
	private SourcesOfAddedMoneyServices addedMoneyServices;
	
	@RequestMapping("/source")
	public List<SourceOfAddedMoney> getAllSourcesOfMoney(){
		return this.addedMoneyServices.getAllSourcesOfMoney();
	}
	
	@RequestMapping(value="/source", method=RequestMethod.POST)
	public void addSourcesOfMoney(@RequestBody SourceOfAddedMoney source) {
		this.addedMoneyServices.addSourcesOfMoney(source);
	}
}
