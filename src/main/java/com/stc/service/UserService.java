package com.stc.service;

import java.util.List;

import com.stc.daoImpl.UserDaoImpl;
import com.stc.entity.Employee;
import com.stc.entity.EmployeeUIBean;
import com.stc.entity.UserEntity;

public class UserService {
	UserDaoImpl userDaoImpl=new UserDaoImpl();
	Employee employee=new Employee();
	
	public boolean userSignIn(EmployeeUIBean employeeUIBean){
		Boolean flag=false;
		employee=userDaoImpl.userSignIn(employeeUIBean);
		if(employee!=null){
		if(employee.getUserName().equals(employeeUIBean.getUserName()) && employee.getPassword().equals(employeeUIBean.getPassword())){	
			flag= true;
		}
		}else{
			flag= false;
		}
		return flag;
		
	}

	
	public List<UserEntity>  getUserDetails(){
		
		
		List<UserEntity> listUser = userDaoImpl.getUserDetails();
		
		
		return listUser;
		
	}
	
}
