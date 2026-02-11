package com.tnsif.statickeywordemo;
// demo for static method

public class Student {
	int rollno;
	String name;
	static String college="IIT";
	
	//static method change value
	
	static void change() {
		college="nagarjuna";
		
	}
	Student(int r,String s){
		rollno=r;
		name=s;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String[] args) {
		Student.change();
		
		Student s1=new Student(1,"sush");
		Student s2=new Student(2,"suma");
		Student s3=new Student(3,"suhasini");
		
		s1.display();
		s2.display();
		s3.display();
		
	}

}
