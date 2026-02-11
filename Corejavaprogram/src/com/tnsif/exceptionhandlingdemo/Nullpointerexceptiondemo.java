package com.tnsif.exceptionhandlingdemo;
// demo for null pointer

public class Nullpointerexceptiondemo {
	public static void main(String[] args) {
		String str=null;
		try {
		System.out.println(str.length());
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("welcome to exception handling");
	}

}
