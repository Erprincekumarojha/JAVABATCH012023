package com.interface1;

public abstract class AbstractClass {

	public int m1() { // concrete method | normal method
		return 0;
	}

	public abstract void m2();

}

interface InterfaceClass {
	void m1();

	default void m2() {

	}

	static void m3() {

	}
	
	
}
