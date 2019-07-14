package com.liquibase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.liquibase.entity.Employee;


@Service
public interface Employeeservice {

	public List<Employee> getEmployees();
	public Employee getEmployeeById(int empid);
	public Employee addNewEmployee(Employee emp);
	public Employee updateEmployee(Employee emp);
	public void deleteEmployeeById(int empid);

}