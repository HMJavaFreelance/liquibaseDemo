package com.liquibase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liquibase.dal.DboDeploysRepository;
import com.liquibase.entity.DboDeploys;



@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	DboDeploysRepository dao;

	@Override
	public List<DboDeploys> getDboDeployss() {
		return dao.findAll();
	}
	@Override
	public DboDeploys getDboDeploysById(int empid) {
		return dao.findById(empid);
	}
	@Override
	public DboDeploys addNewDboDeploys(DboDeploys emp) {
		return dao.saveorUpdate(emp);
	}
	@Override
	public DboDeploys updateDboDeploys(DboDeploys emp) {
		return dao.saveorUpdate(emp);
	}
	@Override
	public void deleteDboDeploysById(int empid) {
		dao.deleteById(empid);
	}
}