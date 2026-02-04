package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	private EmployeeService empservice;

	public EmployeeController(EmployeeService empservice) {
		this.empservice = empservice;
	}
	
	@GetMapping("/employee/getdetails")
	public List<Employee> getEmployees(){
		return empservice.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		return empservice.getEmployeeById(id);
	}
	
	@PostMapping("/employee/addemployee")
	@ResponseStatus(HttpStatus.CREATED)
	public Employee addEmployee(@RequestBody Employee emp) {
		return empservice.SaveEmployee(emp);
	}
	
	@PutMapping("employee/updateEmp/{id}")
	public Employee updateEmployee( @PathVariable int id,@RequestBody Employee upemp) {
		return empservice.updateEmployee(id, upemp);
	}
	
	@DeleteMapping("/employee/deleteEmp/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEmployee(@PathVariable int id) {
		empservice.deleteEmployee(id);
	}
	
}
