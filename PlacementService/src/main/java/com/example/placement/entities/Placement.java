package com.example.placement.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pis_placements")
public class Placement {
	
	@Id
	@Column(name="p_activity_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int activityId;
	
	@Column(name="student_enrollment_id")
	private int studentEnrollId;
	
	@Column(name="is_placed_flag")
	private boolean isPlaced;
	
	@Column(name="applied_company")
	private String appliedCompany;
	
	@Column(name="attemptedCompany")
	private String attemptedCompany;

	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getActivityId() {
		return activityId;
	}

	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}

	public int getStudentEnrollId() {
		return studentEnrollId;
	}

	public void setStudentEnrollId(int studentEnrollId) {
		this.studentEnrollId = studentEnrollId;
	}

	public boolean isPlaced() {
		return isPlaced;
	}

	public void setPlaced(boolean isPlaced) {
		this.isPlaced = isPlaced;
	}

	public String getAppliedCompany() {
		return appliedCompany;
	}

	public void setAppliedCompany(String appliedCompany) {
		this.appliedCompany = appliedCompany;
	}

	public String getAttemptedCompany() {
		return attemptedCompany;
	}

	public void setAttemptedCompany(String attemptedCompany) {
		this.attemptedCompany = attemptedCompany;
	}
	

}
