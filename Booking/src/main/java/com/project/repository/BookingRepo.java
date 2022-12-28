package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking,Integer>{

	 //public List<Booking> findByPassengerId(int passengerId);
}								
