package com.tnsif.inheritanceprogram;
//child class

public class Student extends Course{
	String Student="amit";
	
	void studentcourse() {
		System.out.println(Student);
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.showcourse();
		s.studentcourse();
	}

}
