package com.concurrent;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadPoolExecutor;

public class TestCuncorrent {

	 
	public static void main(String[] args) {

		ThreadPoolExecutor t = new ThreadPoolExecutor(0, 0, 0, null, null);
		
		//ConcurrentLinkedQueue<Integer> arrayList = new ConcurrentLinkedQueue<>();
		CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>();
		// Add elements to the ArrayList
		arrayList.add(1);
		arrayList.add(2);
		arrayList.add(3);

		// Create a thread to modify the ArrayList while iterating
		Thread modifyThread = new Thread(() -> {
			Iterator<Integer> iterator = arrayList.iterator();
			while (iterator.hasNext()) {
				Integer value = iterator.next();
				System.out.println(value);
				arrayList.add(4); // Concurrent modification
			}
		});

		// Start the modifyThread
		modifyThread.start();

		// Wait for the modifyThread to finish
		try {
			modifyThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(arrayList);
	}
}
