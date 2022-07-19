package com.sweetcherry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="Cupcakes_details")
public class Cupcakes {
	
	@Id
	@GeneratedValue
	private Integer cupcakeId;
	
	private String cupcakeName;
	private String cupcakeDescription;
	private String price;
	private String rating;
	
	@ManyToOne
	private CupcakeCategory cupcakeCategory;

	public Cupcakes() {
		super();
	}

	public Cupcakes(Integer cupcakeId, String cupcakeName, String cupcakeDescription, String price, String rating,
			CupcakeCategory cupcakeCategory) {
		super();
		this.cupcakeId = cupcakeId;
		this.cupcakeName = cupcakeName;
		this.cupcakeDescription = cupcakeDescription;
		this.price = price;
		this.rating = rating;
		this.cupcakeCategory = cupcakeCategory;
	}

	public Integer getCupcakeId() {
		return cupcakeId;
	}

	public void setCupcakeId(Integer cupcakeId) {
		this.cupcakeId = cupcakeId;
	}

	public String getCupcakeName() {
		return cupcakeName;
	}

	public void setCupcakeName(String cupcakeName) {
		this.cupcakeName = cupcakeName;
	}

	public String getCupcakeDescription() {
		return cupcakeDescription;
	}

	public void setCupcakeDescription(String cupcakeDescription) {
		this.cupcakeDescription = cupcakeDescription;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public CupcakeCategory getCupcakeCategory() {
		return cupcakeCategory;
	}

	public void setCupcakeCategory(CupcakeCategory cupcakeCategory) {
		this.cupcakeCategory = cupcakeCategory;
	}
	
	
	
	

}
