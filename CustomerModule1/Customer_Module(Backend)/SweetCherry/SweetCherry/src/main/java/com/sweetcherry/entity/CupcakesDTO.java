package com.sweetcherry.entity;

public class CupcakesDTO {
	
	private String cupcakeName;
	private String cupcakeDescription;
	private String price;
	private String rating;
	private Integer categoryId;
	public CupcakesDTO() {
		super();
	}
	public CupcakesDTO(String cupcakeName, String cupcakeDescription, String price, String rating, Integer categoryId) {
		super();
		this.cupcakeName = cupcakeName;
		this.cupcakeDescription = cupcakeDescription;
		this.price = price;
		this.rating = rating;
		this.categoryId = categoryId;
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
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	
	

}
