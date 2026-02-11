package com.tnsif.finaldemo;
// demo for final variable
public class UPIApp {
	final int Max_limit=10000; // daily tranfer limit

	void show() {
		System.out.println(Max_limit);
	}
	public static void main(String[] args) {
		 UPIApp u=new  UPIApp();
		 u.show();
	 u.Max_limit=30000;// u cant change the value
	}
}
