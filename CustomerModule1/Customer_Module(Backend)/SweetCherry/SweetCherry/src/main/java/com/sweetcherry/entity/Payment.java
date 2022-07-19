package com.sweetcherry.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="Payment")
public class Payment {
	
	@Id
	@GeneratedValue
	private Integer paymentId;

	private long cardNo;

	private int cvv;

	private String cardHolderName;

	private String expiryDate;

	private String status;

	public Payment() {
		super();
	}

	public Payment(Integer paymentId, long cardNo, int cvv, String cardHolderName, String expiryDate, String status) {
		super();
		this.paymentId = paymentId;
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
		this.expiryDate = expiryDate;
		this.status = status;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public long getCardNo() {
		return cardNo;
	}

	public void setCardNo(long cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
