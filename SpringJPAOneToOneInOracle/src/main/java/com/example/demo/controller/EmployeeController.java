package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeRequestAll;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employeeServices")
public class EmployeeController {

	private final EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	@PostMapping("/createEmp")
	public Employee create(@RequestBody EmployeeRequestAll request) {

	    System.out.println("Name : " + request.getName() + " - " +request.getEmail() + " - " +request.getProfile().getPhone()+ " - " +request.getProfile().getAddress());

	    return employeeService.createEmpWithProfile(request.getName(),request.getEmail(),request.getProfile().getPhone(),request.getProfile().getAddress());
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> all() {
		List<Employee> employees = employeeService.getAll();
		for (Employee employee : employees) {
			System.out.println(employee.getName() + "- " + employee.getEmail());
		}
		return employeeService.getAll();
	}

	@GetMapping("/getempbyid/{id}")
	public Employee byId(@PathVariable Long id) {
		return employeeService.getById(id);
	}

	@DeleteMapping("/deleteEmpbyid/{id}")
	public String delete(@PathVariable Long id) {
		employeeService.deleteById(id);
		return "Deleted employee id = " + id;
	}
	
	@PutMapping("/updateEmpbyid/{id}")
	public Employee update(@PathVariable Long id, @RequestBody EmployeeRequestAll req) {
		
		if (req.getProfile() == null) {
	        throw new RuntimeException("Profile is required");
	    }
		
		return employeeService.updateEmployeeWithProfile(id, req.getName(), req.getEmail(), req.getProfile().getPhone(),req.getProfile().getAddress());
	}
	
}
