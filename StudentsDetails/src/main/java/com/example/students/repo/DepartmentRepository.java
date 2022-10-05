package com.example.students.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.students.entities.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
