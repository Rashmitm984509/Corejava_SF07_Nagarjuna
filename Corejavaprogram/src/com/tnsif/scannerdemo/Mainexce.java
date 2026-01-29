package com.tnsif.scannerdemo;

import java.util.Scanner;

// demo for scanner class
public class Mainexce {
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int a=sc.nextInt();
	System.out.println("number is "+ a);
	System.out.println("enter the name");
	String b=sc.next();	
	System.out.println("name is "+ b);
	
	}

}
