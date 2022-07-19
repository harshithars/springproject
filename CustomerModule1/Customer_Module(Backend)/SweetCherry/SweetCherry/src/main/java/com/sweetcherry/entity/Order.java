package com.sweetcherry.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity(name="Customer_order")
public class Order {
	
	@Id
	@GeneratedValue
	private Integer orderId;
	
	private String orderDate;
	private Integer quantity;
	private String orderStatus;
	private Double totalPrice;
	
	@OneToOne
	private Customer customer;
	
	@ManyToOne
	private Payment payment;
	
	@ManyToMany
	private List<Cupcakes> cupcakes=new ArrayList<Cupcakes>();

	public Order() {
		super();
	}

	public Order(Integer orderId, String orderDate, Integer quantity, String orderStatus, Double totalPrice,
			Customer customer,Payment payment, List<Cupcakes> cupcakes) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
		this.totalPrice = totalPrice;
		this.payment = payment;
		this.cupcakes = cupcakes;
		this.customer=customer;
	}
	

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public List<Cupcakes> getCupcakes() {
		return cupcakes;
	}

	public void setCupcakes(List<Cupcakes> cupcakes) {
		this.cupcakes = cupcakes;
	}


}
