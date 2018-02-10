package com.stc.dao;

import java.util.List;

import com.stc.entity.Employee;
import com.stc.entity.EmployeeUIBean;
import com.stc.entity.UserEntity;

public interface IUserDao {

public List<Employee> getUser();

public Integer getUserEmpId();

public String getUserFirstName();

public Employee getUserById();

public Employee userSignIn(EmployeeUIBean employeeUIBean);

public List<UserEntity> getUserDetails();
	
	
}
