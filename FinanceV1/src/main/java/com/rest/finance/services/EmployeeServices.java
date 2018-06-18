package com.rest.finance.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.finance.entitys.Employee;
import com.rest.finance.resourcesinterfaces.EmployeeRepository;

@Service
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository repository;
	
	public List<Employee> findAllEmployee(){
		List<Employee> employeesList = new ArrayList<>();
		this.repository.findAll().forEach(employeesList::add);
		
		return employeesList;
	}
	
	public void addEmployee(Employee employee) {
		this.repository.save(employee);
	}
}
