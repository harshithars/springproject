package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

}
