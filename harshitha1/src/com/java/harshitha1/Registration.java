package com.java.harshitha1;

import java.util.Scanner;

class CustomerEntity{
	String firstname;
	String lastname;
	String email;
	String password;
	long phoneno;
	public CustomerEntity() {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.phoneno = phoneno;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "CustomerEntity [firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + ", password="
				+ password + ", phoneno=" + phoneno + "]";
	}
	
	
}
public class Registration {
	public static void main(String[] args) {
		CustomerEntity register=new CustomerEntity();
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first name => ");
		String firstname = scanner.nextLine();
		register.setFirstname(firstname);
		
		System.out.println("Enter lastname => ");
		String lastname = scanner.nextLine();
		register.setLastname(lastname);
		
		System.out.println("Enter email => ");
		String email = scanner.nextLine();
		register.setEmail(email);
		
		System.out.println("Enter password => ");
		String password = scanner.nextLine();
		register.setPassword(password);
		
		System.out.println("Enter phoneno => ");
		long phoneno = scanner.nextLong();
		register.setPhoneno(phoneno);
		
		printRegisterData(register);
	}
	
	private static void printRegisterData(CustomerEntity register) {
		System.out.println(register.getFirstname());
		System.out.println(register.getLastname());
		System.out.println(register.getEmail());
		System.out.println(register.getPassword());
		System.out.println(register.getPhoneno());
	}
}
