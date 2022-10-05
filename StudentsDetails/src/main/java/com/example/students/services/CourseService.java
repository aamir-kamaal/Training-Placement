package com.example.students.services;

import java.util.List;

import com.example.students.entities.Course;


public interface CourseService{
	
	List<Course> getAllCourses();
	
	Course addCourse(Course course);
	
	Course getCourseById(int Id);
}
