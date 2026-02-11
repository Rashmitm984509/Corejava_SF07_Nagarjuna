package com.tnsif.exceptionhandlingdemo;
// demo for array index out of bound exception
public class Arrayindexdemo {
	public static void main(String[] args) {
	
	int arr[]=new int[4];
	try {
		System.out.println("good things");
		int i=arr[5];
		System.out.println(i);
		System.out.println("hello world");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	}
}
