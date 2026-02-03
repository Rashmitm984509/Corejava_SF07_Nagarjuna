package com.tnsif.inheritanceprogram;

//parent class
class Employee{
	void company() {
		System.out.println("company : Techcorp");
	}
}


//child class1
class Developer extends Employee{
	void role() {
		System.out.println("role : software developer");
	}
}

//child class2
class Tester extends Employee{
	void role() {
		System.out.println("Role:QA Tester");
	}
}


public class Hierachicaldemo {
	public static void main(String[] args) {
		Developer  d=new Developer ();
		Tester  t=new Tester ();
		
		d.company();
		d.role();
		
		t.company();
		t.role();
	}

}
