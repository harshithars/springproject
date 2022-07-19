package com.sweetcherry.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="Cupcake_category")
public class CupcakeCategory {
	
	@Id
	@GeneratedValue
	private Integer categoryId;
	
	private String categoryName;
	
	@OneToMany
	private List<Cupcakes> cupcakes = new ArrayList<Cupcakes>();

	public CupcakeCategory() {
		super();
	}

	public CupcakeCategory(Integer categoryId, String categoryName, List<Cupcakes> cupcakes) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.cupcakes = cupcakes;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Cupcakes> getCupcakes() {
		return cupcakes;
	}

	public void setCupcakes(List<Cupcakes> cupcakes) {
		this.cupcakes = cupcakes;
	}
	
	
	
	

}
