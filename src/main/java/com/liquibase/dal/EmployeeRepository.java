package com.liquibase.dal;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liquibase.entity.Employee;

@Repository
public interface EmployeeRepository {

	List<Employee> findAll();
	
	Employee findById(int empid);
	
	Employee saveorUpdate(Employee emp);
	
	void deleteById(int empid);	
}
