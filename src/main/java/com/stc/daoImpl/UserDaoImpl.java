package com.stc.daoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


import com.stc.dao.IUserDao;
import com.stc.entity.Employee;
import com.stc.entity.EmployeeUIBean;

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



	public Employee userSignIn(EmployeeUIBean employeeUIBean) {
		
		Employee employee=null;
		List<Employee> employeelst=null;
		String userName=employeeUIBean.getUserName();
		try{
			String hql = "from  Employee as upe WHERE upe.userName ='"+userName+"'";
			 Session session = com.stc.util.HibernateUtil.getSession();
			 session.beginTransaction();
			//session.createQuery("from Employee").list();
			employeelst=session.createQuery(hql).list();
			//query.setParameter(0, userName);
			/*List<Employee> employeelst=query.list();*/  
			for(Employee empdata:employeelst){
				employee=new Employee();
				employee.setUserName(empdata.getUserName());
				employee.setPassword(empdata.getPassword());
			}
		
			
		}catch(Exception e){
			e.printStackTrace();
		}
	
		
		
		finally{
			
			
		}
		return employee;
	
	}
	
	

}
