package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "SweetcherryLogin")
public class SweetCherryLogin {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String email;
	private String password;
	
	public SweetCherryLogin() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "SweetCherryLogin [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
}
