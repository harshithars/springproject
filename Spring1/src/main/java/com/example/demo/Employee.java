package com.example.demo;

public class Employee {
	
	private int eid;
	private String ename;
	public Employee() {
		System.out.println("^^Employee() Cons");
	}
	
	public Employee(int eid,String ename) {
		System.out.println("^^Employee(int,String)Cons");
		this.eid=eid;
		this.ename=ename;
	}
	
	public void setEid(int eid) {
		this.eid=eid;
		System.out.println("^^setEid()**");
	}

	

}
