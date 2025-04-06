package com.first.sb.api.services;

import com.first.sb.api.domain.Employee;

public interface EmployeeServices{

	public Employee insertEmpDetails(Employee employee);
	public Employee getEmployee(int empId);
	public Employee retEmployeeDet(String empName);
	public Employee updateEmp(Employee employee);
	
}
