package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Driver;

@Repository
public interface DriverRepo extends JpaRepository<Driver,Integer>{
	public List<Driver> findByDriverCity(String City);
}
