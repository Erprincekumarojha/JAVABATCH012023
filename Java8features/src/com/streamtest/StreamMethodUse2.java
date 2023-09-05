package com.streamtest;

import java.util.List;
import java.util.Optional;

public class StreamMethodUse2 {
	
	public static void main(String[] args) {
		
//		List<Integer> list = List.of(300,10);
//		Optional<Integer> findFirst = list.stream().findFirst();
//		if(findFirst.isPresent()) {
//			System.out.println(findFirst.get());	
//		}else {
//			System.out.println("No Elements");
//		}
		
		List<Integer> list = List.of(15,21,31,40,51);
		
		Optional<Integer> findAny = list.stream()
				.filter(e->e>30).findAny();
		
		if(findAny.isPresent()) {
			System.out.println(findAny.get());	
		}else {
			System.out.println("No Elements");
		}
		
		
		System.out.println(list.stream().filter(e->e%2==0).count());
		
	}

}
