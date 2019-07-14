package com.liquibase.dal;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.liquibase.entity.DboDeploys;

@Repository
public interface DboDeploysRepository {

	List<DboDeploys> findAll();
	
	DboDeploys findById(int empid);
	
	DboDeploys saveorUpdate(DboDeploys emp);
	
	void deleteById(int empid);	
}
