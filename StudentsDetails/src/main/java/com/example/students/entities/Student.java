package com.example.students.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "sis_students")
public class Student {

	@Column(name = "enrollment_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int enrollmentId;

	@ManyToOne(cascade = CascadeType.ALL)
	Department fk;
	
	@Column(name="student_first_name")
	private String studentFirstName;
	
	@Column(name="student_last_name")
	private String studentLastName;
	
	@Column(name="student_age")
	private int studentAge;
	
	@Column(name="student_gender")
	private String studentGender;

	@Column(name="student_dob")
	private String studentDob;
		
	public Student(){
		super();
	}

	public int getEnrollmentId() {
		return enrollmentId;
	}

	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public String getStudentDob() {
		return studentDob;
	}

	public void setStudentDob(String studentDob) {
		this.studentDob = studentDob;
	}

	public Department getFk() {
		return fk;
	}

	public void setFk(Department fk) {
		this.fk = fk;
	}
}