package com.rest.finance.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.finance.entitys.Employee;
import com.rest.finance.services.EmployeeServices;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeServices service;
	
	@CrossOrigin("*")
	@RequestMapping("/employee")
	public List<Employee> findAllEmployee(){
		return this.service.findAllEmployee();
	}
	
	@CrossOrigin("*")
	@RequestMapping(value="employee", method= RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		this.service.addEmployee(employee);
	}
}
