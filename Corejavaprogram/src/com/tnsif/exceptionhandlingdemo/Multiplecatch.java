package com.tnsif.exceptionhandlingdemo;
// demo for multiple catch block

public class Multiplecatch {
	public static void main(String[] args) {
		int a=9;
		int s=0;
		try {
			int c=a/s;
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println("morning");
		}
		
		catch(ArithmeticException d) {
			System.out.println("welcome");
		}
		
		catch(Exception u) {
			System.out.println("hello");
		}
		
		
	}

}
