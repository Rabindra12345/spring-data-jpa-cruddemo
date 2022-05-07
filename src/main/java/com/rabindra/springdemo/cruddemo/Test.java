package com.rabindra.springdemo.cruddemo;

import org.springframework.stereotype.Component;

@Component
public class Test {
	
	public static int checkUser() {
		
		String sqlstr = "SELECT COUNT(id) FROM employee";
		int str = Integer.parseInt(sqlstr);

	    return str;
		
	}
	
	public static void main(String [] args) {
		
		
		System.out.println(checkUser());
	}

	
}
