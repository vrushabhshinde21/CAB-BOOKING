package com.project.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Passenger;
import com.project.service.PassengerService;

@RestController
@CrossOrigin(origins = "*")
public class Controller {
	
	@Autowired
	PassengerService ps;
	
	@PostMapping("/passengers/passenger")
	public Passenger createPassenger(@RequestBody Passenger passenger) {
		return ps.createPassenger(passenger);
		}
	
	@GetMapping("/passengers/passengers")
	public List<Passenger> getAllPassenger() {
		return ps.getAllPassenger();
	}
	
	@GetMapping("/passengers/passenger/{id}")
	public Optional<Passenger> getPassengerById(@PathVariable int id) {
		return ps.getPassengerById(id);
	}
	
	@GetMapping("/passengers/passenger/login")
	public Passenger getPassengerByEmailAndPassword(@RequestBody Passenger passenger) {
		return ps.getPassengerByEmailAndPassword(passenger);
	}

	@DeleteMapping("/passengers/passenger/{id}")
	public Boolean deletePassengerById(@PathVariable int id) {
		return ps.deletePassengerById(id);
	}

	@PutMapping("/passengers/passenger/{id}")
	public String UpdatePassengerById(@PathVariable int id,@RequestBody Passenger passenger) {
			return ps.UpdatePassengerById(id, passenger);
	}
	

}
