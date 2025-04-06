package com.first.sb.api.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.PutExchange;

import com.first.sb.api.domain.Employee;
import com.first.sb.api.repos.EmployeeRepository;
import com.first.sb.api.services.EmployeeServices;

//C_C - extends
//C_I - implements
//I_I - extends
//I_C - NOT POSSIBLE
@Service
public class EmployeeServicesImpl implements EmployeeServices{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee insertEmpDetails(Employee employee) {
		Employee emp=employeeRepository.save(employee);
		return emp;
	}

	@Override
	public Employee getEmployee(int empId) {
		Optional<Employee> emp=employeeRepository.findById(empId);
		if (emp.isPresent()) {
			return emp.get();
		}
		throw new IllegalArgumentException("PLease check the Employee Id");
	}

	@Override
	public Employee retEmployeeDet(String empName) {
		Employee empl=employeeRepository.findByName(empName);
		return empl;
	}

	@Override
	public Employee updateEmp(Employee employee) {
		Employee dbEmployeeDet = retEmployeeDet(employee.getName());
		if(dbEmployeeDet!=null) {
			dbEmployeeDet.setName(employee.getName());
			dbEmployeeDet.setSalary(employee.getSalary());
		    employeeRepository.save(dbEmployeeDet);	
		}
		else {
			throw new IllegalArgumentException("No EmployeeDetails Found");
		}
		return dbEmployeeDet;
	}
	
	
	
	
	
	
}
