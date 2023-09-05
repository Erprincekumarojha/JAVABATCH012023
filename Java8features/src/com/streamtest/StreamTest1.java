package com.streamtest;

import java.util.Arrays;
import java.util.List;

public class StreamTest1 {

	public static void main(String[] args) {

		//use of filter
		List<String> words = Arrays.asList("Hello", "world", "how", "are", "you");
		words.stream().filter(e->e.toLowerCase().startsWith("h"))
		.forEach(e->System.out.println(e));
		
		System.out.println("--------------------");
		//use of map
		//words.stream().map(String :: toUpperCase).forEach(System.out::println);
		words.stream().map(e->e.toUpperCase()).forEach(System.out::println);
		
		System.out.println("------------------");
		//use of reduce
		String reduce = words.stream().reduce(" ", (a,b)->a+" "+b);
		System.out.println(reduce);
		
		
		
		
	}

}
