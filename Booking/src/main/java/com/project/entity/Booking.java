package com.project.entity;

import java.sql.Date;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.hibernate.annotations.CurrentTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.tuple.GenerationTiming;
//import org.hibernate.annotations.CreationTimestamp;
//import org.hibernate.annotations.UpdateTimestamp;
//import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;
//
//import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookingId;	
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	@UpdateTimestamp
	private Date bookingDate;
	@CurrentTimestamp(timing=GenerationTiming.ALWAYS)
	private LocalTime bookingTime;	
	private String passengerName;
	private String source;
	private String destination;
	
	@ManyToOne(targetEntity = Driver.class,cascade = CascadeType.ALL)
	@JoinColumn(name="driverid", referencedColumnName = "driverId")
	private Driver driver;
	private String driverName;

	@OneToOne(targetEntity = Car.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "carid", referencedColumnName = "carId" )
	private Car car;
	private String carName;
	
	
	@OneToOne(targetEntity =Passenger.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "passengerid",referencedColumnName = "passengerId")
	private Passenger passenger;

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public LocalTime getBookingTime() {
		return bookingTime;
	}

	public void setBookingTime(LocalTime bookingTime) {
		this.bookingTime = bookingTime;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}



	public Booking() {
		super();
	}

	public Booking(int bookingId, Date bookingDate, LocalTime bookingTime, String passengerName, String source,
			String destination, Driver driver, String driverName, Car car, String carName, Passenger passenger) {
		super();
		this.bookingId = bookingId;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
		this.passengerName = passengerName;
		this.source = source;
		this.destination = destination;
		this.driver = driver;
		this.driverName = driverName;
		this.car = car;
		this.carName = carName;
		this.passenger = passenger;
	}

	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", bookingDate=" + bookingDate + ", bookingTime=" + bookingTime
				+ ", passengerName=" + passengerName + ", source=" + source + ", destination=" + destination
				+ ", driver=" + driver + ", driverName=" + driverName + ", car=" + car + ", passenger=" + passenger
				+ "]";
	}
	
	
	
}
