package com.liquibase.dal;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liquibase.dal.service.CommonDAO;
import com.liquibase.dal.service.OperationTypeEnum;
import com.liquibase.entity.DboDeploys;

@Transactional
@Repository
public class DboDeploysRepositoryImpl implements DboDeploysRepository{

	@Autowired
	CommonDAO commonDao;

	@Override
	public List<DboDeploys> findAll() {
		List<DboDeploys> lstEmplyee  = commonDao.findEntity(DboDeploys.class);
		return lstEmplyee;
	}

	@Override
	public DboDeploys findById(int empid) {
		List<DboDeploys> lstEmplyee  = commonDao.findEntity(DboDeploys.class, "employeeId",OperationTypeEnum.EQ ,empid);
		DboDeploys dbObjEmplyee = new DboDeploys();
		if(!lstEmplyee.isEmpty()) {
			dbObjEmplyee =  lstEmplyee.get(0);
		}
		return dbObjEmplyee;
	}

	@Override
	public DboDeploys saveorUpdate(DboDeploys emp) {
		commonDao.saveOrUpdate(emp);
		return emp;
	}

	@Override
	public void deleteById(int empid) {
		DboDeploys employee = new DboDeploys();
		employee.setDboDeploysId(empid);
		commonDao.delete(employee);		
	}
	
	
}
