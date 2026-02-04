package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepository;

@Service
public class EmployeeService {

	private final EmployeeRepository repo;

	public EmployeeService(EmployeeRepository repo) {
		this.repo = repo;
	}
	
	public Employee SaveEmployee(Employee emp) {
		System.out.println(emp.getId()+" -"+emp.getName()+" -"+emp.getSalary());
		
		return repo.save(emp);
	}
	
	public List<Employee> getAllEmployees(){
		return repo.findAll();
	}
	
	public Employee getEmployeeById(int id) {
		return repo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with id : "+id));
	}
	
	public Employee updateEmployee(int id,Employee updatedemployee) {
		Employee extemp=repo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with id : "+id) );
		
		extemp.setName(updatedemployee.getName());
		extemp.setSalary(updatedemployee.getSalary());
		
		return repo.save(extemp);
	}
	
	public void deleteEmployee(int id) {	
		Employee extemp=repo.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with id : "+id) );
		
		repo.delete(extemp);
	}
}
