package com.tnsif.statickeywordemo;
// demo for static variables

public class Userdemo {
	String Username;
	static String appname="instaclone";// shared by all users
	
	Userdemo(String Username){
		this.Username=Username;
	}
	//method
	void showdetails() {
		System.out.println("user : "+Username +" "+"App : "+appname);
	}
	
public static void main(String[] args) {
	Userdemo d1=new Userdemo("renu");
	Userdemo d2=new Userdemo("ruth");
	
	d1.showdetails();
	d2.showdetails();
}
}
