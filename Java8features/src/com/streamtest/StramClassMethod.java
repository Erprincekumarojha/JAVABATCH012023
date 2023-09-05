package com.streamtest;

import java.util.List;
import java.util.stream.Collectors;

public class StramClassMethod {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(10 , 21, 30, 50, 75, 88);
		
		List<Integer> collect = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
