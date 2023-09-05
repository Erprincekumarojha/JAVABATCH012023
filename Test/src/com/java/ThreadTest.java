package com.java;

public class ThreadTest {

	public static void main(String[] args) {
		
		String start = ThreadStatus.RUN.getStart();
		System.out.println(start);
		
		ThreadStatus threadStatusByStart = ThreadStatus.getThreadStatusByStart("running");
		int status = threadStatusByStart.getStatus();
		System.out.println(status);
	}
}
