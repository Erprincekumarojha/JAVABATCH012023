package com.base64;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava8 {
	
	public static void main(String[] args) {
		
		List<Integer> list= List.of(1,2,3,4,5,1,3,4);
		List<Integer> collect = list.stream().filter(e->e%2==0)
				.collect(Collectors.toList());
		System.out.println(collect);
		
		list.forEach(System.out::println);
		int arr[] = {1,2,3,4,5,1,2,3,78,23};
		Arrays.parallelSort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
