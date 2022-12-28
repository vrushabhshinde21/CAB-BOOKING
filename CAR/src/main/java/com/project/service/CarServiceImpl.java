package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.CarRepo;
import com.project.entity.Car;

@Service
public class CarServiceImpl implements CarService{
	
	@Autowired
	CarRepo cr;

	@Override
	public List<Car> getAllCars() {
		return cr.findAll();
	}

	@Override
	public Optional<Car> getCarById(int id) {
		return cr.findById(id);
	}

	@Override
	public Car CreateCar(Car car) {
		return cr.save(car);
	}

	@Override
	public Boolean deleteCarById(int id) {
		if(cr.existsById(id)) {
			cr.deleteById(id);
			return true;
		}	
		else
			return false;
		
	}
	
	public String UpdateById(int id,Car car) {
		
		if(cr.existsById(id))
		{
			car.setCarId(id);
			cr.save(car);
			return "record updated successfully";
		}
		else
			return "car not exists by this Id";
	}

}
