package com.concurrency;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListIssueMultipleThread {

	public static void main(String[] args) {
		
		List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
		copyOnWriteArrayList.add("Ajit");
		copyOnWriteArrayList.add("Super");
		copyOnWriteArrayList.add("Duper");
		
		Thread t = new Thread(()->{
		   Iterator<String> iterator = copyOnWriteArrayList.iterator();
		   while(iterator.hasNext()) {
			  System.out.println( iterator.next());
			  copyOnWriteArrayList.add("One");
			 
		   }
		});
		
		
		t.start();
		
		try {
			t.join();
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		System.out.println(copyOnWriteArrayList.size());
		System.out.println(copyOnWriteArrayList);
	}
}
