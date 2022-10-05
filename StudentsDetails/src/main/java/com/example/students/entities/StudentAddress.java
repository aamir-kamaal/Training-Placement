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
@Table(name = "sis_student_address")
public class StudentAddress {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="address_id")
	private int addressId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Student fk;
	
	@Column(name="address_type")
	private String addressType;
	
	@Column(name="address_line1")
	private String addressLineOne;
	
	@Column(name="address_line2")
	private String addressLinetwo;
	 
	@Column(name="address_city")
	private String addressCity;
	
	@Column(name="address_state")
	private String addressState;

	@Column(name="address_zip")
	private String addressZip;
	
	@Column(name="address_country")
	private String addressCountry;

	public StudentAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressLineOne() {
		return addressLineOne;
	}

	public void setAddressLineOne(String addressLineOne) {
		this.addressLineOne = addressLineOne;
	}

	public String getAddressLinetwo() {
		return addressLinetwo;
	}

	public void setAddressLinetwo(String addressLinetwo) {
		this.addressLinetwo = addressLinetwo;
	}

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
	}

	public String getAddressState() {
		return addressState;
	}

	public void setAddressState(String addressState) {
		this.addressState = addressState;
	}

	public String getAddressZip() {
		return addressZip;
	}

	public void setAddressZip(String addressZip) {
		this.addressZip = addressZip;
	}

	public String getAddressCountry() {
		return addressCountry;
	}

	public void setAddressCountry(String addressCountry) {
		this.addressCountry = addressCountry;
	}	
	
}
