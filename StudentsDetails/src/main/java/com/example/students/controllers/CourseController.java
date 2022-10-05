package com.example.students.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.students.entities.Course;
import com.example.students.servimpl.CourseServiceImplementation;

@RestController
public class CourseController {
	
	@Autowired
	private CourseServiceImplementation courseServiceImplementation;
	
	@GetMapping("/courses")
	public List<Course> courseData()
	{
		return courseServiceImplementation.getAllCourses();
	}
	
	@GetMapping("/course{courseID}")
	public Course courseData(@PathVariable int courseID)
	{
		//returning course by Id
		return courseServiceImplementation.getCourseById(courseID);		
	}
	
	@PostMapping("/course/saveCourse")
	public Course saveCourse(@RequestBody Course course)
	{
		//saving course into database
		return courseServiceImplementation.addCourse(course);
	}

}
