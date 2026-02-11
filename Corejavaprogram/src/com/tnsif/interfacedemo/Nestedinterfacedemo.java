package com.tnsif.interfacedemo;

public class Nestedinterfacedemo implements Myinterface.Myinnerinterface{

	@Override
	public void print() {
		System.out.println("nested interface");
		
	}
public static void main(String[] args) {
	Nestedinterfacedemo n=new Nestedinterfacedemo();
	n.print();
	System.out.println(n.id);
	System.out.println(Nestedinterfacedemo.id);
}
}
