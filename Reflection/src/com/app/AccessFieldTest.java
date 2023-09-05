package com.app;

import java.lang.reflect.Field;

public class AccessFieldTest {

	public static void main(String[] args) throws Exception{
		
	 MyClass instance = new MyClass();	
	 Class<?> classDetails = instance.getClass();
	 
	 Field field = classDetails.getDeclaredField("data");
	 
	 //enable field for public access
	 field.setAccessible(true);
	 
	 String oldData = (String) field.get(instance);
	 System.out.println(oldData);
	 
	 //modeify data
	 field.set(instance, "Hello Java is Awesome");
	 
	 String currentData = (String) field.get(instance);
	 System.out.println(currentData);
	 
	 
	}
}
