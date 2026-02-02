package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private final EmployeeService empservice;

    public EmployeeController(EmployeeService empservice) {
        this.empservice = empservice;
    }

    @GetMapping("/spel-empdetails")
    public String showSpELDemo() {
        return empservice.getEmployeeDetails();
    }

}
