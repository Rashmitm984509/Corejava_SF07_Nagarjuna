package com.tnsif.polymorphismdemo;
// demo for constructor overload

public class Student {
	String name;
	int age;
	
	int Student(){
		return 3;
//		System.out.println("default constructor");
	}
	Student(String name){
		this.name=name;
		System.out.println("name "+name);
	}
	Student(String name , int age){
		this.name=name;
		this.age=age;
		System.out.println("name "+name +" Age "+age);
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("alice");
		Student s3=new Student("abc",3);
		
		
	}

}
