package com.app;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousExample {
	public static void main(String[] args) {
		System.out.println("Start of main");

		// Creating an executor service
		ExecutorService executor = Executors.newFixedThreadPool(1);

		// Submitting an asynchronous task
		executor.submit(()-> printNumbers());
		for (int i = 1; i <= 50; i++) {
			System.out.println(i*10);
		}
		// Continue with other tasks
		System.out.println("Continuing with other tasks");

		// Shutting down the executor
		executor.shutdown();

		System.out.println("End of main");
	}

	public static void printNumbers() {
		for (int i = 1; i <= 50; i++) {
			System.out.println(i);
		}
	}
}
