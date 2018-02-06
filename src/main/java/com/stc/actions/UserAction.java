package com.stc.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.stc.entity.Employee;
import com.stc.entity.EmployeeUIBean;
import com.stc.service.UserService;

public class UserAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Employee employee = new Employee();
	EmployeeUIBean employeeUIBean = new EmployeeUIBean();
	UserService userService = new UserService();
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
