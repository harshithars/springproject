package com.sweetcherry.entity;

import javax.persistence.GeneratedValue;

public class OrderDTO {
	@GeneratedValue
    private Integer orderId;
	
	private String orderDate;
	private Integer quantity;
	private String orderStatus;
	private Double totalPrice;
	
	public OrderDTO() {
		super();
	}
	public OrderDTO(Integer orderId, String orderDate, Integer quantity, String orderStatus, Double totalPrice) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.totalPrice = totalPrice;
		
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}
	

	
	
}
