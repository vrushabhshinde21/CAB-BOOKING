package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.entity.Driver;

public interface DriverService {
	
	public List<Driver> getAllDriver();
	public Driver CreateDriver(Driver driver);
	public Optional<Driver> getDriverById(int id);
	public Boolean deleteDriverById(int id);
	public String updateDriverById(int id,Driver driver);
	public List<Driver> getDriverByCity(String city);
}
