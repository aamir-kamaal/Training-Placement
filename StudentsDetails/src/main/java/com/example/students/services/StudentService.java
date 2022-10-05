package com.example.students.services;

import java.util.List;

import com.example.students.entities.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student saveStudent(Student s);
	
	public Student getStudentById(int Id);
}
