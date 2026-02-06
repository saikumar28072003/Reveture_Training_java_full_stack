package com.example.demo.service;

	import java.util.List;

	import org.springframework.stereotype.Service;

	import com.example.demo.entity.Department;
	import com.example.demo.entity.Employee;
	import com.example.demo.repo.DepartmentRepository;

	@Service
	public class DepartmentService {
		private final DepartmentRepository deptRepo;

	    public DepartmentService(DepartmentRepository deptRepo) {
	        this.deptRepo = deptRepo;
	    }

	    
	    public Department createSampleDepartment() {
	        Department dept = new Department("IT Department");

	        Employee emp1 = new Employee("sai kumar", "sai@company.com");
	        Employee emp2 = new Employee("nikhil", "nikhil@company.com");
	        Employee emp3 = new Employee("mubeen", "mube345@company.com");

	        dept.addEmployee(emp1);
	        dept.addEmployee(emp2);
	        dept.addEmployee(emp3);

	        return deptRepo.save(dept);
	    }

	    public List<Department> getAllDepartments() {
	        return deptRepo.findAll();
	    }

	    public Department getDepartmentById(Long id) {
	        return deptRepo.findById(id)
	                .orElseThrow(() -> new RuntimeException("Department not found: " + id));
	    }

	    public void deleteDepartment(Long id) {
	        deptRepo.deleteById(id);
	    }
	}
