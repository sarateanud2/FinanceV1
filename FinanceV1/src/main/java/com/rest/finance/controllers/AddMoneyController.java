package com.rest.finance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.finance.entitys.AddedMoney;
import com.rest.finance.services.AddedMoneyServices;

@RestController
@CrossOrigin("*")
public class AddMoneyController {

	@Autowired
	private AddedMoneyServices addedMoneyServices;
	
	@RequestMapping("/addedmoney")
	public List<AddedMoney> getAllAddedMoney(){
		return this.addedMoneyServices.getAllAddedMoney();
	}
	
	@RequestMapping("/addedmoney/{id}")
	public List<AddedMoney> findBySourceOfAddedMoneyId(@PathVariable Long id){
		return this.addedMoneyServices.findBySourceOfAddedMoneyId(id);
	}
	
	@RequestMapping(value="/addedmoney", method=RequestMethod.POST)
	public void addMoney(@RequestBody AddedMoney money) {
		this.addedMoneyServices.addMoney(money);
	}
}
