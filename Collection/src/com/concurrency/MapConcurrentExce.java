package com.concurrency;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class MapConcurrentExce {
	
	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> map = new ConcurrentHashMap();
		
		map.put("1", "prince");
		map.put("2", "Ajit");
		map.put("3", "Sujit");
		
		
		Thread writeThread1 = new Thread(()->{
			map.put("10", "A");
			map.put("20", "B");
		});
		
		Thread writeThread2 = new Thread(()->{
			map.put("100", "AA");
			map.put("200", "BB");
		});
		
		
		Thread readThread1 = new Thread(()->{
			Iterator<String> iterator = map.keySet().iterator();
		    while (iterator.hasNext()) {
				
		    	String key = iterator.next();
		    	System.out.println(key+ "-  - "+ map.get(key));
		    	//add some eleemtn in map
		    	map.put("4", "Raju");
				
			}	
		});
		
		writeThread1.start();
		writeThread2.start();
		readThread1.start();;
		
		
	
	}

}
