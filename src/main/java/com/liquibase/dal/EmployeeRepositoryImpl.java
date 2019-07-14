package com.liquibase.dal;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liquibase.dal.service.CommonDAO;
import com.liquibase.dal.service.OperationTypeEnum;
import com.liquibase.entity.Employee;

@Transactional
@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	@Autowired
	CommonDAO commonDao;

	@Override
	public List<Employee> findAll() {
		List<Employee> lstEmplyee  = commonDao.findEntity(Employee.class);
		return lstEmplyee;
	}

	@Override
	public Employee findById(int empid) {
		List<Employee> lstEmplyee  = commonDao.findEntity(Employee.class, "menuPk",OperationTypeEnum.EQ ,empid);
		Employee dbObjEmplyee = new Employee();
		if(!lstEmplyee.isEmpty()) {
			dbObjEmplyee =  lstEmplyee.get(0);
		}
		return dbObjEmplyee;
	}

	@Override
	public Employee saveorUpdate(Employee emp) {
		commonDao.saveOrUpdate(emp);
		return emp;
	}

	@Override
	public void deleteById(int empid) {
		Employee employee = new Employee();
		employee.setEmployeeId(empid);
		commonDao.delete(employee);		
	}
	
	
}
