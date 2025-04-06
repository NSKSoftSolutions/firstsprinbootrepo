package com.first.sb.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.first.sb.api.domain.Employee;
import com.first.sb.api.services.EmployeeServices;

@Controller
@ResponseBody
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;

	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		Employee empInfo = employeeServices.insertEmpDetails(employee);
		return empInfo;
	}
	//http://localhost:8080/employee/2
	/*
	 * @GetMapping("/employee/{empId}") public Employee retEmployee(@PathVariable
	 * int empId){ Employee emp=employeeServices.getEmployee(empId); return emp; }
	 */
	@GetMapping("/employee/{empName}")
    public Employee getEmployeeDet(@PathVariable String empName){
    	Employee empl=employeeServices.retEmployeeDet(empName);
		return empl;
		
    } 
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return employeeServices.updateEmp(employee);
	}
	
	
}
//postman-->controller --> service --> repository -->DB
