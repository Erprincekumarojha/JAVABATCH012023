package com.app;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestMethod {
	
	public static void main(String[] args) throws Exception {
		
		Class<MyClass> classDetails = MyClass.class;
		
		// read the constructor details
		Constructor<?> constructordata = classDetails.getConstructor();
		// created new object with constructor
		MyClass newInstance = (MyClass)constructordata.newInstance();
		
		Field id = classDetails.getDeclaredField("id");
		id.canAccess(true);
		id.set(newInstance, "23");
		
		
		
	}

}
