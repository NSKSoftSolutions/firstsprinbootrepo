package com.first.sb.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.first.sb.api.domain.Organization;
import com.first.sb.api.repos.OrganizationServices;

@RestController
public class OrgnizationController {

	
	@Autowired
	private OrganizationServices orgServices;
	
	@PostMapping("/organization")
	public Organization addOrginzation(@RequestBody Organization organization){
		 System.out.println(organization);
		 return orgServices.insertOrgDet(organization);
	}
	@GetMapping("/organization/{orgName}")
	public Organization retOrg(@PathVariable String orgName) {
		return orgServices.getOrgDet(orgName);
	}
	@DeleteMapping("/organization/{orgName}")
	public boolean deleteorg(@PathVariable String orgName) {
		return orgServices.deleteOrgByName(orgName);
	}
}
