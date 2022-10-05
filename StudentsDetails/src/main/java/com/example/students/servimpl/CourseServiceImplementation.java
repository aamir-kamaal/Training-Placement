package com.example.students.servimpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.students.entities.Course;
import com.example.students.repo.CourseRepository;
import com.example.students.services.CourseService;

@Service
public class CourseServiceImplementation implements CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	@Override
	public List<Course> getAllCourses() {
		
		return courseRepository.findAll();
	}
	
	@Override
	public Course getCourseById(int Id)
	{
		return courseRepository.findById(Id).get();
	}

	@Override
	@Transactional
	public Course addCourse(Course course) {
		
		return courseRepository.save(course);
	}
	
}
