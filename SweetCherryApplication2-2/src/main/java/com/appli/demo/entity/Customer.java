package com.appli.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer id;
	
	@Column(name="customer_id")
	private String customrId;
	
	@Column(name="customer_name")
	private String customrName;
	
	@Column(name="customer_email")
	private String customremail;
	
	@Column(name="customer_password")
	private String customrpassword;
	
	@Column(name="customer_address")
	private String customraddress;

	public Customer(Integer id, String customrId, String customrName, String customremail, String customrpassword,
			String customraddress) {
		super();
		this.id = id;
		this.customrId = customrId;
		this.customrName = customrName;
		this.customremail = customremail;
		this.customrpassword = customrpassword;
		this.customraddress = customraddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCustomrId() {
		return customrId;
	}

	public void setCustomrId(String customrId) {
		this.customrId = customrId;
	}

	public String getCustomrName() {
		return customrName;
	}

	public void setCustomrName(String customrName) {
		this.customrName = customrName;
	}

	public String getCustomremail() {
		return customremail;
	}

	public void setCustomremail(String customremail) {
		this.customremail = customremail;
	}

	public String getCustomrpassword() {
		return customrpassword;
	}

	public void setCustomrpassword(String customrpassword) {
		this.customrpassword = customrpassword;
	}

	public String getCustomraddress() {
		return customraddress;
	}

	public void setCustomraddress(String customraddress) {
		this.customraddress = customraddress;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", customrId=" + customrId + ", customrName=" + customrName + ", customremail="
				+ customremail + ", customrpassword=" + customrpassword + ", customraddress=" + customraddress + "]";
	}
	
	

}
