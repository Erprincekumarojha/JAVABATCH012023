package com.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//int sum = numbers.stream().filter(n->n%2!=0).mapToInt(n->n).sum();
		
		int sum  =0;
		for(Integer i : numbers) {
			if(i%2!=0) {
				sum = sum+i;
			}
		}
		
		
		System.out.println(sum);
	}

}
