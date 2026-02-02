package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	private final EmployeeService empservice;

	public EmployeeController(EmployeeService empservice) {
		this.empservice = empservice;
	}
	
	@GetMapping("/employee")
	public String getemployee() {
		return empservice.getemployeeDetails();
	}

}
