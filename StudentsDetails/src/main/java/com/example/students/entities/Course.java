package com.example.students.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sis_courses")
public class Course {
	
	@Column(name = "course_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int courseId;
	
	@Column(name = "course_name")
	private String courseName;
	
	@Column(name = "course_duration")
	private int courseDuration;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(int courseDuration) {
		this.courseDuration = courseDuration;
	}	

}
