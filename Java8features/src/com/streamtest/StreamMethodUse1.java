package com.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethodUse1 {
	
	public static void main(String[] args) {
		
		 List<Integer> list = Arrays.asList(3, 9,12,15);
	     
		    // Check if all elements of stream
		    // are divisible by 3 or not using
		    // Stream allMatch(Predicate predicate)
		  list.stream().allMatch(n-> n % 3 ==0);
		     
		    // Displaying the result
		  //  System.out.println(answer);
		
		/*
		 * List<String> list = List.of("java", "is", "awesome","java", "is");
		 * 
		 * Optional<String> reduce = list.stream().reduce((a,b)->a+"-"+b);
		 * System.out.println(reduce.get());
		 * 
		 * String reduce2 = list.stream().reduce("", (a,b)->a+"-"+b);
		 * 
		 * System.out.println(reduce2);
		 */
		//distint()
		//List<String> listUnike = list.stream().distinct().collect(Collectors.toList());
		//System.out.println(listUnike);
		
		//sorting
		//List<String> sorted = list.stream().sorted().collect(Collectors.toList());
		//System.out.println(sorted);
		
		//List<Integer> list = List.of(10,20,30,40,50,60,70,80,90,100);
		//list.stream().limit(2).forEach(System.out::println);
		
		//list.stream().skip(3).forEach(System.out::println);
	}

}
