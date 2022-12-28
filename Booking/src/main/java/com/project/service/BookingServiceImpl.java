package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.entity.Booking;
import com.project.entity.Car;
import com.project.entity.Driver;
import com.project.entity.Passenger;
import com.project.repository.BookingRepo;

@Service
public class BookingServiceImpl implements BookingService{

	@Autowired
	RestTemplate rest;
	@Autowired
	BookingRepo br;

	Booking book=new Booking();
	
	@Override
	public Passenger findPassenger(int passengerId) {
		return rest.getForObject("http://localhost:8082/passengers/passenger/"+passengerId, Passenger.class);		
	}
	
	@Override
	public Car bookCar(int carId) {
		return rest.getForObject("http://localhost:8080/cars/car/"+carId, Car.class);
	}

	@Override
	public Driver bookDriver(int driverId) {
		return rest.getForObject("http://localhost:8084/drivers/driver/"+driverId, Driver.class);
	}

	@Override
	public Booking createBooking(Booking booking,int pid,int cid,int did) {
		
		book.setSource(booking.getSource());
		book.setDestination(booking.getDestination());
		
		//passenger details for passenger
		Passenger p=findPassenger(pid);
		book.setPassengerName(p.getPassengerName());
		
		//car details for booking
		Car c=bookCar(cid);
		book.setCarName(c.getModel());
		
		//driver details for driver
		Driver d=bookDriver(did);
		book.setDriverName(d.getDriverName());
		
		
		System.out.println(book);
		
		System.out.println(pid);
		System.out.println(cid);
		System.out.println(did);
		
		booking=book;
		System.out.println(booking);
		return br.save(booking);
	}

	@Override
	public List<Booking> bookingHistory() {
		return br.findAll();
	}

	@Override
	public Boolean deleteBooking(int bookingId) {
		if(br.existsById(bookingId)) {
			br.deleteById(bookingId);
			return true;
		}else {
			return false;
		}
	}
	
}









































//@Override
//public String createBooking(Booking bookingdetails) {	 //int driverId,int carId,int passengerId
//	booking.setSource(bookingdetails.getSource());
//	booking.setDestination(bookingdetails.getDestination());
//	
//	booking.setCarId(bookCar(bookingdetails.getCarId()).getCarId());
//	
//	booking.setDriverId(bookDriver(bookingdetails.getDriverId()).getDriverId());
//	booking.setDriverName(bookDriver(bookingdetails.getDriverId()).getDriverName());
//	
//	Passenger p=resttemplate.getForObject("http://localhost:8082/passengers/passenger/"+bookingdetails.getPassengerId(), Passenger.class);
//	booking.setPassengerId(p.getPassengerId());
//	booking.setPassengerName(p.getPassengerName());
//	
//	br.save(booking);
//	return "YOUR RIDE IS BOOKED!!!";
//}
