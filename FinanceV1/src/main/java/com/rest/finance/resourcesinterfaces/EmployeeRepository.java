package com.rest.finance.resourcesinterfaces;

import org.springframework.data.repository.CrudRepository;

import com.rest.finance.entitys.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
