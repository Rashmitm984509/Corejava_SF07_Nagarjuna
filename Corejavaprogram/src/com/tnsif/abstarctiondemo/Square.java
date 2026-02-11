package com.tnsif.abstarctiondemo;
// subclass or child class
public class Square extends Shape{
	
	private float side;
	public Square() {
		side=3.0f;
	}
	public Square(float side) {
		this.side=side;
	}

	@Override
	void calarea() {
		super.area=side*side;
	}
	
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
	
	
	public static void main(String[] args) {
		Square s=new Square(3);
		System.out.println(s);
		s.calarea();
	}
	

}
