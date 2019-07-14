package com.liquibase.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liquibase.entity.Employee;
import com.liquibase.service.Employeeservice;

@Controller
public class EmployeeController {
	
	@Autowired
	Employeeservice service;

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showLoginPage(){	
        return "employee";
    }
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveEmployee(HttpServletRequest request){	
		
		Employee employee = new Employee();
		employee.setEmail(request.getParameter("employeeemail"));
		employee.setEmployeeName(request.getParameter("employeename"));
		employee.setSalary(Double.parseDouble(request.getParameter("employeesalary")));
		System.out.println(employee.getEmail());
		System.out.println(employee.getEmployeeName());
		service.addNewEmployee(employee);
        return "employee";
    }
}
