package com.project.controller;

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

import com.project.entity.Driver;
import com.project.service.DriverService;

@RestController
@CrossOrigin(origins = "*")
public class DriverController {
	@Autowired
	DriverService ds;
	
	@GetMapping("/drivers/drivers")
	public List<Driver> findAllDrivers(){
		return ds.getAllDriver();
	}
	
	@GetMapping("/drivers/driver/{driverid}")
	public Optional<Driver> findDriverById(@PathVariable("driverid") int driverId){
		return ds.getDriverById(driverId);
	}
	
	@GetMapping("drivers/drivers/{drivercity}")
	public List<Driver> getDriverByCity(@PathVariable("drivercity") String city) {
		return ds.getDriverByCity(city);
		}
	
	@PostMapping("/drivers/driver")
	public Driver createDriver(@RequestBody Driver driver) {
		return ds.CreateDriver(driver);
	}
	
	@DeleteMapping("/drivers/driver/{driverid}")
	public Boolean deleteDriverById(@PathVariable("driverid") int driverId) {
		return ds.deleteDriverById(driverId);
	}
	
	@PutMapping("/drivers/driver/{driverid}")
	public String updateDriverById(@PathVariable("driverid") int driverId ,@RequestBody Driver driver) {
		return ds.updateDriverById(driverId, driver);
	}
}
