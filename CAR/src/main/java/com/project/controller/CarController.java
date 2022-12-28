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

import com.project.entity.Car;
import com.project.service.CarService;

@RestController
@CrossOrigin(origins = "*")
public class CarController {
	
	@Autowired
	CarService cs;
	
	@GetMapping("/cars/cars")
	public List<Car> getAllCars(){
		return cs.getAllCars();
	}
	
	@GetMapping("/cars/car/{id}")
	public Optional<Car> getCarById(@PathVariable("id") int id) {
		return cs.getCarById(id);
	}
	
	@PostMapping("/cars/car")
	public Car createCar(@RequestBody Car car) {
		return cs.CreateCar(car);
	}
	
	@DeleteMapping("/cars/car/{id}")
	public Boolean deleteCarById(@PathVariable("id") int id){
		return cs.deleteCarById(id);
	}
	
	@PutMapping("/cars/car/{id}")
	public String updateCarById(@PathVariable("id") int id,@RequestBody Car car) {
		return cs.UpdateById(id, car);
	}
}
