package com.tnsif.abstarctiondemo;
// demo for abstraction

public abstract class Shape {
	
	protected float area; // variable
	// abstract method
	
	abstract void calarea();
	
	//Concrete method
	
	void show() {
		System.out.println("area of the shape "+area);
	}

	
	
	
	
}
