package com.example.students.servimpl;

import java.util.LinkedList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.entities.Department;
import com.example.students.repo.DepartmentRepository;
import com.example.students.services.DepartmentService;

@Service
public class DepartmentServiceImplementation implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public List<Department> getAllDepartments() {
		
		List<Department> departmentList = new LinkedList<Department>();
		Iterable<Department> d =  departmentRepository.findAll();
		d.forEach(departmentList::add);
		return departmentList;
	}

	@Override
	@Transactional
	public Department saveDepartment(Department department) {
		return departmentRepository.save(department);
	}

	@Override
	public Department getDepartmentById(int Id) {
		return departmentRepository.findById(Id).get();
	}

}
