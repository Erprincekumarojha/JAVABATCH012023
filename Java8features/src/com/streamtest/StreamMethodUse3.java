package com.streamtest;

import java.util.Collections;
import java.util.List;

public class StreamMethodUse3 {

	public static void main(String[] args) {

		List<Integer> list = List.of(15, 21, 31, 40, 51, 22, 12);
//		Integer max = Collections.max(list);
//		Integer min = Collections.min(list);
//		System.out.println("Max : "+max+   "     Min : "+min);

		// lambda expression
		Integer max1 = list.stream().max((a, b) -> a.compareTo(b)).get();
		Integer min1 = list.stream().min((a, b) -> a.compareTo(b)).get();
		System.out.println("Max1 : " + max1 + "     Min1 : " + min1);

		// method reference
		Integer max2 = list.stream().max(Integer::compare).get();
		Integer min2 = list.stream().min(Integer::compare).get();
		System.out.println("Max2 : " + max2 + "     Min2 : " + min2);

	}

}
