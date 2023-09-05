package com.synch;

public class TestWaitAndSleepMethod {
	
	public static Object obj = new Object();
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("main started");
		Thread.sleep(5000);
		System.out.println("sleep done");
		
		System.out.println("main stop");
	}

}
