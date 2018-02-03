package com.stc.service;

import com.stc.daoImpl.UserDaoImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDaoImpl user = new UserDaoImpl();
		
		System.out.println("The Result is" + user.getUser() );
		

	}

}
