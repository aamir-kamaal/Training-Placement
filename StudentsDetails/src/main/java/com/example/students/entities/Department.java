package com.example.students.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "sis_departments")
public class Department {
	
	@Column(name="department_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int departmentId;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	Course id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Course getId() {
		return id;
	}

	public void setId(Course id) {
		this.id = id;
	}	
	
}
