package com.CollectorsMethod;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMethodTest2 {

	public static void main(String[] args) {

		// counting
		List<Integer> list = List.of(1, 2, 3, 4, 5, 1, 2, 1, 2, 3);
		Long collect = list.stream().collect(Collectors.counting());
		Map<Integer, Long> collect2 = list.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
		System.out.println(collect);
		System.out.println(collect2);

		// summingInt
		List<Integer> list2 = List.of(1, 2, 3, 4, 5);
		IntSummaryStatistics collect3 = list2.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(collect3.getSum());

		// averiging
		List<Integer> list3 = List.of(1, 2, 3, 4, 5);
		Double collect4 = list3.stream().collect(Collectors.averagingInt(e -> e));
		System.out.println(collect4);
		List<Character> ch = Arrays.asList('j','a','v','a');

		// minBy
		List<Integer> list5 = List.of(-19, 1, 2, 3, 4, 5);
		Integer integer = list5.stream().collect(Collectors.minBy(Integer::compareTo)).get();
		System.out.println("min : " + integer);

		// maxBy
		Integer integer2 = list5.stream().collect(Collectors.maxBy(Integer::compareTo)).get();
		System.out.println("max : " + integer2);
		
		//partision
		List<Integer> list6 = List.of(1, 2, 3, 4, 5,6,7,8,9,10);
		Map<Boolean, List<Integer>> collect5 = list6.stream()
				.collect(Collectors.partitioningBy(e->e>5));
		System.out.println(collect5);
		
		//joining
		List<Character> char1 = Arrays.asList('j','a','v','a');
		String collect6 = char1.stream().map(String::valueOf).collect(Collectors.joining());
		System.out.println(collect6);
		
	}

}
