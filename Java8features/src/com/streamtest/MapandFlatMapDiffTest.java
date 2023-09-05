package com.streamtest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapandFlatMapDiffTest {

	public static void main(String[] args) {

		/*
		 * List<String> words = Arrays.asList("apple", "mango", "banana", "fruits",
		 * "orange"); List<Integer> collect =
		 * words.stream().map(e->e.length()).collect(Collectors.toList());
		 * System.out.println(words); System.out.println(collect);
		 */
		
		List<List<Integer>> numList = new ArrayList<>();
		numList.add(Arrays.asList(1,2,3));
		numList.add(Arrays.asList(20,9,350));
		numList.add(Arrays.asList(78,0,1));
		numList.add(Arrays.asList(11,20,30,4,7,8));
		//[[1, 2, 3], [20, 9, 350], [78, 0, 1], [11, 20, 30, 4, 7, 8]]
		//output :[1, 2, 3, 20, 9, 350, 78, 0, 1, 11, 20, 30, 4, 7, 8]
		System.out.println(numList);
		
		List<Integer> collect = numList.stream()
				.flatMap(list ->list.stream()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
