package com.tnsif.packagedemo;
// demo for access modifier program
// public

 class Demo {
	
	public int a=70;  // properties 
	 String s="rashmi";
	
	void drink() {
		
	}
	
	public static void main(String[] args) {
		Demo d=new Demo(); // object created 
		System.out.println(d.a);
		System.out.println(d.s);
	}

}
