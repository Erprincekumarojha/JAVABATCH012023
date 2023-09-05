package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapSWtudentTestData {

	public static void main(String[] args) {

		HashMap<String, String> s1 = new HashMap<>();
		s1.put("studentId", "101");
		s1.put("studentName", "prince");
		s1.put("studentAge", "24");
		s1.put("course", "java");
		s1.put("fee", "1000");

		HashMap<String, String> s2 = new HashMap<>();
		s2.put("studentId", "102");
		s2.put("studentName", "Ajay");
		s2.put("studentAge", "21");
		s2.put("course", "python");
		s2.put("fee", "3000");

		List<Map<String, String>> students = new ArrayList<Map<String, String>>();
		students.add(s1);
		students.add(s2);
		
		Map<List<String>, String> map  = new HashMap<>();
		
		// Print all those student data
		for(Map<String, String> s : students) {
			System.out.println(s);
		}
	}

}
