package com.methodref;

import java.util.function.BiFunction;

@FunctionalInterface
interface MyFunctionData{
	void getData(String s);
}

interface AdditionFunInterface{
	int add(int a, int b);
}

public class InstanceMethodReference {

    public void myMethod(String d) {
    	System.out.println("I am good: Instance method reference"+d);
    }
    
    public int addition(int a, int b) {
    	return a+b;
    }
	public static void main(String[] args) {
		
	    InstanceMethodReference rf = new InstanceMethodReference();
	    MyFunctionData data = rf::myMethod;
	    data.getData("ok");
	    
	    AdditionFunInterface add = rf::addition;
	    System.out.println(add.add(10, 20));
	    
	    BiFunction<Integer, Integer, Integer> bi = rf::addition;
	    System.out.println(bi.apply(200, 500));
	}
}
