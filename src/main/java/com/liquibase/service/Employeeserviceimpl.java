package com.liquibase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liquibase.dal.EmployeeRepository;
import com.liquibase.entity.Employee;



@Service
public class Employeeserviceimpl implements Employeeservice {

	@Autowired
	EmployeeRepository dao;

	@Override
	public List<Employee> getEmployees() {
		return dao.findAll();
	}
	@Override
	public Employee getEmployeeById(int empid) {
		return dao.findById(empid);
	}
	@Override
	public Employee addNewEmployee(Employee emp) {
		return dao.saveorUpdate(emp);
	}
	@Override
	public Employee updateEmployee(Employee emp) {
		return dao.saveorUpdate(emp);
	}
	@Override
	public void deleteEmployeeById(int empid) {
		dao.deleteById(empid);
	}
}