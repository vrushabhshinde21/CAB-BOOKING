package com.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Car;

@Repository
public interface CarRepo extends JpaRepository<Car, Integer> {

}
