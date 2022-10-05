package com.example.students.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.students.entities.Department;
import com.example.students.servimpl.DepartmentServiceImplementation;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentServiceImplementation dsi;
	
	@GetMapping("/departments")
	public List<Department> getAllDepartments(){
		
		return dsi.getAllDepartments();		
	}
	
	@GetMapping("/department{departmentId}")
	public Department getDepartmentById(@PathVariable int departmentId){
		
		return dsi.getDepartmentById(departmentId);		
	}
	
	@PostMapping("/department/saveDepartment")
	public Department saveDepartment(@RequestBody Department department){
		
		return dsi.saveDepartment(department);
	}
	

}
