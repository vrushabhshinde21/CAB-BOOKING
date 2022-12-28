package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

import com.project.entity.Booking;
import com.project.entity.Car;
import com.project.entity.Driver;
import com.project.entity.Passenger;

public interface BookingService {
	
	public Car bookCar(int carId);
	public Driver bookDriver(int driverId);
	public Passenger findPassenger(int passengerId);
	public Booking createBooking(Booking booking,int pid,int cid,int did);
	public List<Booking> bookingHistory();
	public Boolean deleteBooking(int bookingId);
//	public List<Booking> bookingHistoryOfPassenger(int passengerId);
	
}
