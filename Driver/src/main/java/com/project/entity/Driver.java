package com.project.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driverId;
	private String driverName;
	private long driverDLNo;
	private String driverEmail;
	private long driverMobile;
	private String driverCity;
	private Date driverBirthDate;
	private int driverAge;
	private String driverGender;
	
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Driver(int driverId, String driverName, long driverDLNo, String driverEmail, long driverMobile,
			String driverCity, Date driverBirthDate, int driverAge, String driverGender) {
		super();
		this.driverId = driverId;
		this.driverName = driverName;
		this.driverDLNo = driverDLNo;
		this.driverEmail = driverEmail;
		this.driverMobile = driverMobile;
		this.driverCity = driverCity;
		this.driverBirthDate = driverBirthDate;
		this.driverAge = driverAge;
		this.driverGender = driverGender;
	}


	public String getDriverGender() {
		return driverGender;
	}

	public void setDriverGender(String driverGender) {
		this.driverGender = driverGender;
	}

	public int getDriverId() {
		return driverId;
	}

	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public long getDriverDLNo() {
		return driverDLNo;
	}

	public void setDriverDLNo(long driverDLNo) {
		this.driverDLNo = driverDLNo;
	}

	public String getDriverEmail() {
		return driverEmail;
	}

	public void setDriverEmail(String driverEmail) {
		this.driverEmail = driverEmail;
	}

	public long getDriverMobile() {
		return driverMobile;
	}

	public void setDriverMobile(long driverMobile) {
		this.driverMobile = driverMobile;
	}

	public String getDriverCity() {
		return driverCity;
	}

	public void setDriverCity(String driverCity) {
		this.driverCity = driverCity;
	}

	public Date getDriverBirthDate() {
		return driverBirthDate;
	}

	public void setDriverBirthDate(Date driverBirthDate) {
		this.driverBirthDate = driverBirthDate;
	}

	public int getDriverAge() {
		return driverAge;
	}

	public void setDriverAge(int driverAge) {
		this.driverAge = driverAge;
	}
	
	
}
