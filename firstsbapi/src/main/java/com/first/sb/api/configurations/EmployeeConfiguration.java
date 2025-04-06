package com.first.sb.api.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.first.sb.api.domain.Employee;

@Configuration
public class EmployeeConfiguration {

	@Bean
	public Employee getEmployee() {
	
		Employee emp=new Employee();
		emp.setEmpId(1);
		emp.setName("Sajjad");
		emp.setSalary(1810000.00);
		
		return emp;
		
	}
	
	@Bean
	@Primary
	public Employee getEmployee1() {
	
		Employee emp=new Employee();
		emp.setEmpId(2);
		emp.setName("Sachin");
		emp.setSalary(3810000.00);
		
		return emp;
		
	}

}
