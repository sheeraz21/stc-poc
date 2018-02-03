package com.stc.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import com.stc.dao.IUserDao;
import com.stc.entity.Employee;

public class UserDaoImpl implements IUserDao{
	
	
	
	//Session session = HibernateUtil.getSession();
	//session.beginTransaction();

	public List<Employee> getUser() {
		// TODO Auto-generated method stub

		Session session = com.stc.util.HibernateUtil.getSession();
		
		
		List<Employee> courses = null;
		try {
			courses = session.createQuery("from Employee").list();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return courses;
	}
		


	public Integer getUserEmpId() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getUserFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee getUserById() {
		// TODO Auto-generated method stub
		return null;
	}

}
