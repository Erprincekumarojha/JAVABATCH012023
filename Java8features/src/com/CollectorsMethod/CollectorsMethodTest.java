package com.CollectorsMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class CollectorsMethodTest {

	public static void main(String[] args) {
		// toList
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> evenNumbers = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);

		// toSet
		List<Integer> list2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 2, 3, 5);
        Set<Integer> unikeNumbr = list2.stream().collect(Collectors.toSet());
		System.out.println(unikeNumbr);
		Map<Integer, Long> collect4 = list2.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));
		System.out.println(collect4);
		
		//toMap
		List<Student> students = new ArrayList<>();
		students.add(new Student(21, "Ajit"));
		students.add(new Student(22, "Ajay"));
		students.add(new Student(25, "sonu"));
		
		Map<Integer, String> collect = students.stream()
				.collect(Collectors.toMap(Student::getAge, Student::getName));
		System.out.println(collect);
		
		//TOCONmAP
		List<String> list4 = Arrays.asList("java", "is", "awesome");
		ConcurrentMap<Character, String> collect2 = list4.stream()
				.collect(Collectors
						.toConcurrentMap(e->e.charAt(0), String::toUpperCase));
	    System.out.println(collect2);
	    
	    //toCollection
	    List<String> list5 = Arrays.asList("java", "is", "awesome");
	    LinkedHashSet<String> collect3 = list5.stream().collect(Collectors.toCollection(LinkedHashSet::new));
	    System.out.println(collect3);
	    
	    
	}

}
