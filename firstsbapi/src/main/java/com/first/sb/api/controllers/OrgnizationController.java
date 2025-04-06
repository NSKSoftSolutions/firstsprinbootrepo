package com.first.sb.api.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.sb.api.domain.Employee;
import com.first.sb.api.domain.Organization;

@RestController
public class OrgnizationController {

	@Autowired
	private Employee employeeDetails;

	@PostMapping("/organization")
	public Organization addOrginzation(@RequestBody Organization organization){
		
		
		Organization org=new Organization();
		org.setOrgName(organization.getOrgName());
		org.setHeadQuarters(organization.getHeadQuarters());
		org.setContactNumber(organization.getContactNumber());
		Employee employe=organization.getEmployeeDetails();		
		org.setEmployeeDetails(employe);
		return org;
		
	}

	//http://localhost:8080/first-app/organization/Wipro
	@GetMapping("/organization/{orgName}")
	public Organization getOrgDetails(@PathVariable String orgName){
		Organization org=getDummmyOrgnization();
		Map<String,Organization> d=new HashMap<>();
		d.put(orgName, org);
		Organization organization = d.get(orgName);
		
		return new Organization(organization.getOrgName(), organization.getHeadQuarters(), organization.getContactNumber(), employeeDetails);
	}

	private Organization getDummmyOrgnization() {		
		Organization org=new Organization();
		org.setOrgName("Wipro");
		org.setHeadQuarters("EC");
		org.setContactNumber(12345678L);
		org.setEmployeeDetails(employeeDetails);
		return org;
	}
	
	
}
