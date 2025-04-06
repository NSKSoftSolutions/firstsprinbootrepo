package com.first.sb.api.domain;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Organization {
    private String orgName;
	private String headQuarters;
	private Long contactNumber;
	private Employee employeeDetails;
	}
