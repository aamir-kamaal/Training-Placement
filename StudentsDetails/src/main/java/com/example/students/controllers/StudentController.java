package com.example.students.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.students.entities.Student;
import com.example.students.servimpl.StudentServiceImplementation;

@RestController
public class StudentController {
	
	@Autowired
	private StudentServiceImplementation studentServiceImpl;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/students")
	public List<Student> showAllStudents(){
		
		return studentServiceImpl.getAllStudents();
	}
	
	@GetMapping("/student{studentId}")
	public Student getStudentById(@PathVariable int studentId)
	{
		
		Student s = studentServiceImpl.getStudentById(studentId);
		return s;
	}
	
	@PostMapping("/student/saveStudent")
	public Student saveNewStudent(@RequestBody Student s)
	{
		return studentServiceImpl.saveStudent(s);
	}

}
