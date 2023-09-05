package com.streamtest;

import java.util.List;
import java.util.Optional;

public class StreamMethodTest1 { 
	
	public static void main(String[] args) {
		
		//allmatch all the element will match then only it will return true other wise false
		List<Integer> list = List.of(10,20,30,40,52);
		boolean allMatch = list.stream().allMatch(e->e%2==0);
		System.out.println(allMatch);
		
		//anymatch   // if any one of element match with condition then it will return true otherwise false
		boolean anyMatch = list.stream().anyMatch(e->e%2!=0);
		System.out.println(anyMatch);
		
		//nonematch
		List<Integer> list2 = List.of(10,20,30,40,50);
		boolean noneMatch = list2.stream().noneMatch(e->e%2!=0);
		System.out.println(noneMatch);
		
		Optional<Integer> findAny = list.stream().filter(e->e>40).findAny();
		if(findAny.isPresent()) {
			System.out.println(findAny.get());
		}else {
			System.out.println("Not available");
		}
	}

}
