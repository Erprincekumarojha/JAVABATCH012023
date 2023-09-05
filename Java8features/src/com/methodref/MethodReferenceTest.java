package com.methodref;

@FunctionalInterface
interface MyFunction {
	void get();
}

public class MethodReferenceTest {
	public static void data() {
		System.out.println("java is awesome");
	}

	public static void main(String[] args) {

		// method reference to static method
		MyFunction my = MethodReferenceTest::data;
		my.get();

	}

}
