package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Driver;
import com.project.repository.DriverRepo;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepo dr;
	@Override
	public List<Driver> getAllDriver() {
		return dr.findAll();
	}

	@Override
	public Driver CreateDriver(Driver driver) {
		return dr.save(driver);
	}

	@Override
	public Optional<Driver> getDriverById(int id) {
		return dr.findById(id);
	}

	@Override
	public Boolean deleteDriverById(int id) {
		if(dr.existsById(id)){
			dr.deleteById(id);
			return true;
		}
		else
			return false;
	}

	@Override
	public String updateDriverById(int id, Driver driver) {
		
		if(dr.existsById(id)) {
			driver.setDriverId(id);
			dr.save(driver);
			return "Record Added successfully";
		}
		else 
			return "driver record not found with this id";
		
	}

	@Override
	public List<Driver> getDriverByCity(String city) {
		return dr.findByDriverCity(city);
	}

}
