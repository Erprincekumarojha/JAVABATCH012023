package com.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws Exception {

		// read all class details
		// 1.Class<MyClass> classDetails = MyClass.class;
		// 2. Class<?> classDetails = Class.forName("com.app.MyClass");
		MyClass o = new MyClass();
		Class<? extends MyClass> classDetails = o.getClass();
		// read the constructor details
		Constructor<?> constructor = classDetails.getConstructor();
		// created new object with constructor
		Object newInstance = constructor.newInstance();

		// read method details
		Method method = classDetails.getMethod("sayHello");
		method.invoke(newInstance);

	}
}
