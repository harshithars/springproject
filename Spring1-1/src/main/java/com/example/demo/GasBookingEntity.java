package com.example.demo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="gas_Booking")
public class GasBookingEntity {
	@Id
	@GeneratedValue(strategy=GenarationType.AUTO)
	@Column(name="booking_date", nullable=false)
	@DateTimeFormate(pattern="DD-MM-YYYY")
	private LocalDate bookingDate;
	@Column(name="status", nullable=false)
	private Boolean status=false;
	private float bill;
	
	@ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
	private CustomerEntity customer;

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public float getBill() {
		return bill;
	}

	public void setBill(float bill) {
		this.bill = bill;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}
	
	public CustomerEntity getCustomer() {
		return customer;
	}
	public void serCustomer(CustomerEntity customer) {
		this.customer=customer;
	}
}
