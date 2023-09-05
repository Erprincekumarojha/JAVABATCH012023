package com.base64;

interface MyInterface {

	default void myDefaultMethod() {
		System.out.println("java is awesome");
	}
	
	static void MyStaticMethodInInterface() {
		System.out.println("omg Java is awesome");
	}
}

public class DefultInterfaceMethodTest implements MyInterface {

	public static void main(String[] args) {

		DefultInterfaceMethodTest t=  new DefultInterfaceMethodTest();
		t.myDefaultMethod();
		
		MyInterface.MyStaticMethodInInterface();
		
	}

}
