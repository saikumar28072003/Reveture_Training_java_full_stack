package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    private final DepartmentService service;

    public DepartmentController(DepartmentService service) {
        this.service = service;
    }

    
    @PostMapping("/create")
    public Department create() {
        return service.createSampleDepartment();
    }

    
    @GetMapping("/getall")
    public List<Department> all() {
        return service.getAllDepartments();
    }

   
    @GetMapping("/{id}")
    public Department byId(@PathVariable Long id) {
        return service.getDepartmentById(id);
    }

    
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteDepartment(id);
        return "Deleted department id = " + id;
    }
}