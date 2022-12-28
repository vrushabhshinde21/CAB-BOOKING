package com.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PassengerRepo;
import com.project.entity.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService{

	@Autowired
	PassengerRepo pr;
	
	@Override
	public Passenger createPassenger(Passenger passenger) {
		return pr.save(passenger);
	}

	@Override
	public List<Passenger> getAllPassenger() {
		return pr.findAll();
	}

	@Override
	public Optional<Passenger> getPassengerById(int id) {
		return pr.findById(id);
	}

	@Override
	public Boolean deletePassengerById(int id) {
	
		if(pr.existsById(id))
		{
			pr.deleteById(id);
			return true;
		}
		else
			return false;
	}

	@Override
	public String UpdatePassengerById(int id, Passenger passenger) {
		if(pr.existsById(id))
		{
			passenger.setPassengerId(id);
//			System.out.println(passenger.getPassengerEmail());
			pr.save(passenger);
			return "record updated successfully";
		}
		else
			return "passenger not exists by this Id";
	}

	@Override
	public Passenger getPassengerByEmailAndPassword(Passenger passenger) {
		return pr.findByPassengerEmailAndPassword(passenger.getPassengerEmail(),passenger.getPassword());
	}
	
}
