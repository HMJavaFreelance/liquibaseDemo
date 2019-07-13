package com.liquibase.repo;

import org.springframework.data.repository.CrudRepository;

import com.liquibase.entity.Employee;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
