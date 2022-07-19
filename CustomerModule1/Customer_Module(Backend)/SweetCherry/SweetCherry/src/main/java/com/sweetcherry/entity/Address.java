package com.sweetcherry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="Customer_address")
public class Address {
	
	@Id
	@GeneratedValue
	private Integer addressId;
	private String houseNo;
	
	private String city;
	private String state;
	private String pincode;
	private String landmark;
	public Address() {
		super();
	}
	public Address(Integer addressId, String houseNo, String city, String state, String pincode, String landmark) {
		super();
		this.addressId = addressId;
		this.houseNo = houseNo;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.landmark = landmark;
	}
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	

}
