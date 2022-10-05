package com.example.students.servimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.entities.Student;
import com.example.students.repo.StudentRepository;
import com.example.students.services.StudentService;

@Service
public class StudentServiceImplementation implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	@Transactional
	public Student saveStudent(Student s) {
		return studentRepository.save(s);
	}

	@Override
	public Student getStudentById(int Id) {

		return studentRepository.findById(Id).get();
	}

}
