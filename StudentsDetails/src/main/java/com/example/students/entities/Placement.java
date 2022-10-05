package com.example.students.entities;


public class Placement {
	
	private int activityId;
	
	private int studentEnrollId;
	
	private boolean isPlaced;
	
	private String appliedCompany;
	
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
