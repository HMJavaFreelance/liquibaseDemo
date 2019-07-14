package com.liquibase.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.liquibase.entity.DboDeploys;


@Service
public interface TicketService {

	public List<DboDeploys> getDboDeployss();
	public DboDeploys getDboDeploysById(int empid);
	public DboDeploys addNewDboDeploys(DboDeploys emp);
	public DboDeploys updateDboDeploys(DboDeploys emp);
	public void deleteDboDeploysById(int empid);

}