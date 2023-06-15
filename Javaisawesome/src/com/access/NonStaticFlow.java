package com.access;

public class NonStaticFlow {
	
	int a; // instance variable
	
	public NonStaticFlow(){
		System.out.println("Constructor");
	}
	{
		System.out.println("Non-static block");
	}
	public void setA(int a) {
		this.a = a;
		System.out.println("A assigned with : "+a);
	}
	
	
	
	public static void main(String[] args) {
	  NonStaticFlow f = new NonStaticFlow();
	  f.setA(10);
	}

}
