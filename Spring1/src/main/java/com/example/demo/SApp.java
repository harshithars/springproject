package com.example.demo;

import org.springframework.context.ApplicationContext;

public class SApp {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplication Context("manish­spring -config.xml");
		System.out.println("--Spring Co ntainer is Ready --\n");

		Student stud1= context.getBean("stu1",Student.class); 
		stud1.show();
		Student stud2= context.getBean("stu2",Student.class); 
		stud2.show();

		Employee em1= context.getBean("emp1",Employee.class); 
		em1.display();
		Employee em2= context.getBean("emp2",Employee.class); 
		em2.display();

	}


}
