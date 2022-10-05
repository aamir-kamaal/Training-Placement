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
@Table(name="sis_student_contact")
public class StudentContact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="contact_id")
	private int contactId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Student fk;
	
	@Column(name="student_email_id")
	private String studentEmailId;
	
	@Column(name="student_cntct_primary")
	private String studentPrimaryContact;
	
	@Column(name="student_cntct_alt")
	private String studentAlternateContact;
	
	@Column(name="student_cntct_grd")
	private String studentGuardianContact;

	public StudentContact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getStudentEmailId() {
		return studentEmailId;
	}

	public void setStudentEmailId(String studentEmailId) {
		this.studentEmailId = studentEmailId;
	}

	public String getStudentPrimaryContact() {
		return studentPrimaryContact;
	}

	public void setStudentPrimaryContact(String studentPrimaryContact) {
		this.studentPrimaryContact = studentPrimaryContact;
	}

	public String getStudentAlternateContact() {
		return studentAlternateContact;
	}

	public void setStudentAlternateContact(String studentAlternateContact) {
		this.studentAlternateContact = studentAlternateContact;
	}

	public String getStudentGuardianContact() {
		return studentGuardianContact;
	}

	public void setStudentGuardianContact(String studentGuardianContact) {
		this.studentGuardianContact = studentGuardianContact;
	}

}
