package com.project.service;

import java.util.List;
import java.util.Optional;

import com.project.entity.Passenger;

public interface PassengerService {
	public Passenger createPassenger(Passenger passenger);
	public List<Passenger> getAllPassenger();
	public Optional<Passenger> getPassengerById(int id);
	public Boolean deletePassengerById(int id);
	public String UpdatePassengerById(int id,Passenger passenger);
	public Passenger getPassengerByEmailAndPassword(Passenger passenger);
}
