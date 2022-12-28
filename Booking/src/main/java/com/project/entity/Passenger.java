package com.project.entity;

import java.sql.Date;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "passenger")
public class Passenger {
	@Id
	private int passengerId;
	private String passengerName;
	private String passengerEmail;
	private long passengerMobile;
	private String passengerCity;
	
	@DateTimeFormat(pattern = "dd-mm-yy")
	private Date passengerBirthDate;
	private int passengerAge;
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(int passengerId, String passengerName, String passengerEmail, long passengerMobile,
			String passengerCity, Date passengerBirthDate, int passengerAge) {
		super();
		this.passengerId = passengerId;
		this.passengerName = passengerName;
		this.passengerEmail = passengerEmail;
		this.passengerMobile = passengerMobile;
		this.passengerCity = passengerCity;
		this.passengerBirthDate = passengerBirthDate;
		this.passengerAge = passengerAge;
	}

	public int getPassengerId() {
		return passengerId;
	}

	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerEmail() {
		return passengerEmail;
	}

	public void setPassengerEmail(String passengerEmail) {
		this.passengerEmail = passengerEmail;
	}

	public long getPassengerMobile() {
		return passengerMobile;
	}

	public void setPassengerMobile(long passengerMobile) {
		this.passengerMobile = passengerMobile;
	}

	public String getPassengerCity() {
		return passengerCity;
	}

	public void setPassengerCity(String passengerCity) {
		this.passengerCity = passengerCity;
	}

	public Date getPassengerBirthDate() {
		return passengerBirthDate;
	}

	public void setPassengerBirthDate(Date passengerBirthDate) {
		this.passengerBirthDate = passengerBirthDate;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}
	
}

