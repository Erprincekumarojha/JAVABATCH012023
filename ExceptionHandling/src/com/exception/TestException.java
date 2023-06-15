package com.exception;

public class TestException {

	public static void main(String[] args) {
		try {
            System.out.println(4/0);
		}catch(Exception e) {
		  
		  System.out.println("Don't Divide Any value with zero");	
		}
	}

}
