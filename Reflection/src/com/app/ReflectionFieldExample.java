package com.app;

import java.lang.reflect.Field;

class MyClass12 {
    private String myField = "Original Value";
}

public class ReflectionFieldExample {
    public static void main(String[] args) throws Exception {
        // Create an instance of the class
        MyClass12 myInstance = new MyClass12();
        
        // Get the class of the instance
        Class<?> clazz = myInstance.getClass();
        
        // Get the Field object for the field you want to access
        Field myField = clazz.getDeclaredField("myField");
        
        // Enable access to the private field
        myField.setAccessible(true);
        
        // Get the current value of the field
        String currentValue = (String) myField.get(myInstance);
        System.out.println("Current value: " + currentValue);
        
        // Modify the value of the field
        myField.set(myInstance, "Modified Value");
        
        // Get the updated value
        String updatedValue = (String) myField.get(myInstance);
        System.out.println("Updated value: " + updatedValue);
    }
}



