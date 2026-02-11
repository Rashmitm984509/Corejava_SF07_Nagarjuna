package com.tnsif.interfacedemo;

class Smartlight implements SmartDevice{

	@Override
	public void turnon() {
		System.out.println("smart light on");
	}

	@Override
	public void turnoff() {
	System.out.println("smart light off");	
	}

	@Override
	public void getstatus() {
		System.out.println("smart is standby mode");
	}
	
}

public class Interfacedemo {
public static void main(String[] args) {
	Smartlight s=new Smartlight();
	s.turnon();
	s.turnoff();
	s.getstatus();
}
}
