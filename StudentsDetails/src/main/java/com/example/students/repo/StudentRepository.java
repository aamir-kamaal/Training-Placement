package com.example.students.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.students.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
