package com.stc.dao;

import java.util.List;

import com.stc.entity.Employee;

public interface IUserDao {

public List<Employee> getUser();

public Integer getUserEmpId();

public String getUserFirstName();


public Employee getUserById();
	
	
}
