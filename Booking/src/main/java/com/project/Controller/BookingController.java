package com.project.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Booking;
import com.project.service.BookingService;

@RestController
@CrossOrigin(origins = "*")
public class BookingController {
	@Autowired
	BookingService bs;
	
	@PostMapping("/bookings/booking/{passengerid}/{carid}/{driverid}")
	public Booking createBooking(@RequestBody Booking booking,@PathVariable("passengerid") int pid,@PathVariable("carid")int cid,@PathVariable("driverid")int did) {
		return bs.createBooking(booking,pid,cid,did);
	}
	
	@GetMapping("/bookings/bookings")
	public List<Booking> bookingHistory() {
		return bs.bookingHistory();
	}
	
	@DeleteMapping("/bookings/booking/{bookingid}")
	public Boolean deleteBooking(@PathVariable("bookingid") int bookingId) {
		return bs.deleteBooking(bookingId);
	}
	
}
