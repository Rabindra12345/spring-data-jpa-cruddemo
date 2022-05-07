package com.rabindra.springdemo.cruddemo.service;

import java.util.List;
import java.util.Optional;

//import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rabindra.springdemo.cruddemo.dao.EmployeeRepository;
//import com.rabindra.springdemo.cruddemo.dao.EmployeeDAO;
import com.rabindra.springdemo.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//because we're usign jpa repository for db connection we removed @Transactional 
	//from each of the following method
	
	//inject the repository
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);

	}

	@Override
	public Employee getEmployeeById(int employeeId) {
		
		Optional<Employee> result=   employeeRepository.findById(employeeId);
		
		Employee theEmployee= null;
		if(result.isPresent()) {
			theEmployee = result.get();
		}
		else {
			throw new RuntimeException("Did not find the employee id" +employeeId);
		}
		
		return theEmployee;
	}

	@Override
	public void deleteEmployeeById(int employeeId) {
		employeeRepository.deleteById(employeeId);
	}

}
