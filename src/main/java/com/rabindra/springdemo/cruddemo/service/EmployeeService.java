package com.rabindra.springdemo.cruddemo.service;

import java.util.List;

import com.rabindra.springdemo.cruddemo.entity.Employee;


public interface EmployeeService {
	

	public List<Employee> getAll();
	
	
	
	public void save(Employee employee);
	
	public Employee getEmployeeById(int employeeId);
	
	public void deleteEmployeeById(int employeeId);
	
}
