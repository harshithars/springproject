package com.example.demo;

public class Student {
	
	private int sid;
	private String sname;
	public Student() {
		System.out.println("**Student() Cons");
	}
	public Student(int sid, String sname) {
		System.out.println("**Student(int,String) Cons");
		this.sid=sid;
		this.sname=sname;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
		System.out.println("**setSid()**");
	}
	
	public void setSname(String sname) {
		this.sname = sname;
		System.out.println("**setSname()**");
	}

	public void show() {
		System.out.println("\n##Student->show()");
		System.out.println("Sid"+sid+"\t Sname"+sname);
	}
}
