package com.tnsif.polymorphismdemo;
// demo for method overloading 

public class Calculate {
	
	int  add(int a,int b) {
		return a+b;
	}
	int add(int a,int b,int c) {
		return a+b+c;
	}
	double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		Calculate c=new Calculate();
		System.out.println(c.add(3,5 ));
		System.out.println(c.add(7.5, 1.3));
		System.out.println(c.add(1, 2, 3));
	}

}
