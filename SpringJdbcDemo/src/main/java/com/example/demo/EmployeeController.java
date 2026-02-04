package com.example.demo;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	private final EmployeeDao empdao;

	public EmployeeController(EmployeeDao empdao) {
		this.empdao = empdao;
	}

	@GetMapping("/employees")
	public List<Employee> getEmpDetails() {
		
		return empdao.getallemps();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmpById( @PathVariable int id) {
		
		return empdao.getEmpById(id);
	}
	
	@PostMapping("/employees/insert")
	public String addEmp(@RequestBody Employee emp) {
		
		System.out.println("post method received from request body");
		
		System.out.println(emp.getId()+"-"+emp.getName()+"-"+emp.getSalary());
		empdao.addEmployee(emp);
		return "emp added successfully";
	}
	

}
