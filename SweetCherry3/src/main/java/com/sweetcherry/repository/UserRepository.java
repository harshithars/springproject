package com.sweetcherry.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sweetcherry.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
