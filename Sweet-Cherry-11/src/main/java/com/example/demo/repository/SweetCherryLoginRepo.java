package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.SweetCherryLogin;

public interface SweetCherryLoginRepo extends JpaRepository<SweetCherryLogin, Integer> {
	
	@Query("SELECT p FROM SweetCherryLogin p where p.email =?1")
	public List<SweetCherryLogin> seaarch(String email);
	public SweetCherryLogin save(SweetCherryLogin login);

	public List<SweetCherryLogin> search(String lowerCase);
	
}
