package com.example.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@Entity
@Table(name="users")
@AllArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	private String email;

	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	public User(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}

	
	

}
