package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.entity.Car;

public interface CarService {
	
	public List<Car> getAllCars();
	public Optional<Car> getCarById(int id);
	public Car CreateCar(Car car);
	public Boolean deleteCarById(int id);
	public String UpdateById(int id,Car car);
	
}
