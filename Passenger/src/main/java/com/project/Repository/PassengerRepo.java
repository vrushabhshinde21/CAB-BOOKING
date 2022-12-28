package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer>{

	public Passenger findByPassengerEmailAndPassword(String email,String pass);
}
