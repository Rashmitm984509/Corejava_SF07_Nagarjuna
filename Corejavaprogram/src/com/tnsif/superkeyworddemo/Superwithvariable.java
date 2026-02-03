package com.tnsif.superkeyworddemo;
// demo for super variable


//parent class
class Notification{
	String message="default notification"; // variable
}

//child class
class Pushnotification extends Notification{
	String message="push notificiation from whstp";
	
	void notification() {
		System.out.println("child message "+ message);
		System.out.println("parent message "+ super.message);
	}
}


//main class
public class Superwithvariable {
	public static void main(String[] args) {
		Pushnotification p=new Pushnotification();
		p.notification();
	}

}
