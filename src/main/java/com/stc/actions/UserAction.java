package com.stc.actions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;
import com.stc.entity.Employee;
import com.stc.entity.EmployeeUIBean;
import com.stc.entity.UserEntity;
import com.stc.service.UserService;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Employee employee = new Employee();
	EmployeeUIBean employeeUIBean = new EmployeeUIBean();
	UserService userService = new UserService();
	List<UserEntity> listUserEntity=new ArrayList<UserEntity>();
	Boolean userFlag;



	public String loginUser() {
		if ((employeeUIBean.getUserName().equals("") && employeeUIBean.getUserName() == null)
				|| (employeeUIBean.getPassword().equals("") && employee.getPassword() == null)) {
			addActionError("Enter User Name And Password For Sign In");
			return ERROR;
		} else {
			userFlag = userService.userSignIn(employeeUIBean);
			if (userFlag == false) {
				addActionError("Invalid Credential");
				return ERROR;
			}
			

		}
		return SUCCESS;
	}
	
	public String highChart(){
		listUserEntity= userService.getUserDetails();
		
		return SUCCESS;
	}
	
	public String generateReports(){
		return SUCCESS;
	}
	
	
	
	
	
	/**
	 * @return the listUserEntity
	 */
	public List<UserEntity> getListUserEntity() {
		return listUserEntity;
	}

	/**
	 * @param listUserEntity the listUserEntity to set
	 */
	public void setListUserEntity(List<UserEntity> listUserEntity) {
		this.listUserEntity = listUserEntity;
	}
	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee
	 *            the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @return the employeeUIBean
	 */
	public EmployeeUIBean getEmployeeUIBean() {
		return employeeUIBean;
	}

	/**
	 * @param employeeUIBean
	 *            the employeeUIBean to set
	 */
	public void setEmployeeUIBean(EmployeeUIBean employeeUIBean) {
		this.employeeUIBean = employeeUIBean;
	}

}
