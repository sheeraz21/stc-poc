package com.stc.service;

import com.stc.daoImpl.UserDaoImpl;
import com.stc.entity.Employee;
import com.stc.entity.EmployeeUIBean;

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

}
