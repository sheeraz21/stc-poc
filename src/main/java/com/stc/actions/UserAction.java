package com.stc.actions;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String signUpUser(){
		addActionMessage("Hello World");
		return SUCCESS;
	}
	
	public String loginUser(){
		
		return SUCCESS;
	}

}
