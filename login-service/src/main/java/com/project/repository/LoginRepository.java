package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer>{

//	@Query(value = "select * from login where user_name=? and password=?",nativeQuery = false)
	Login findByUserNameAndPassword(String userName, String password);

}
