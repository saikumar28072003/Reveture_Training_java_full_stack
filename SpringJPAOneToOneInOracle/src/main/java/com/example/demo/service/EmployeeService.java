package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.entity.EmployeeProfile;
import com.example.demo.repo.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	public EmployeeService(EmployeeRepository employeeRepository) {
    	this.employeeRepository = employeeRepository;
	}
	
	
	public Employee createEmpWithProfile(String name,String email,String phone,String address) {
		
		Employee emp=new Employee(name,email);
		EmployeeProfile empro=new EmployeeProfile(phone,address);
		emp.setProfile(empro);
		return employeeRepository.save(emp);	
	}
	
	public List<Employee> getAll() {
		return employeeRepository.findAll();
	}
	
	public Employee getById(Long id) {
		return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee Not Found : " + id));
	}
	
	
	public void deleteById(Long id)
	{
		employeeRepository.deleteById(id);
	}
	
	@Transactional
	public Employee updateEmployeeWithProfile(Long id, String name, String email, String phone, String address) {
		
		Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee Not Found : " + id));
		emp.setName(name);
		emp.setEmail(email);
		
		EmployeeProfile empro=emp.getProfile();
		if(empro==null) {
			empro =new EmployeeProfile();
			empro.setEmployee(emp);
			emp.setProfile(empro);
		}
		empro.setPhone(phone);
		empro.setAddress(address);
		
		return employeeRepository.save(emp);
	}
	
}
