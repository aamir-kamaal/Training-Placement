package com.example.students.services;

import java.util.List;

import com.example.students.entities.Department;

public interface DepartmentService {
	
	public List<Department> getAllDepartments();
	
	public Department saveDepartment(Department department);
	
	public Department getDepartmentById(int Id);

}
