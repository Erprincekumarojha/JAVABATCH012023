package com.fi;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyPredicateImplTest {

	public static void main(String[] args) {
		
		Predicate<String> pre = (s) ->{
			System.out.println(s+ " : Java is awesome");
			return false;
		};
		pre.test("My name is ");
		
		Consumer<String> con = (msg) -> System.out.println(msg + " Good Job");
		con.accept("java is awesome");
		
		Function<String, Integer> fun = (s) -> {
		   System.out.println(s);	
		   return s.length();
		};
		System.out.println(fun.apply("java is awesome"));
		
		Supplier<String> sup = () -> "java is swesome";
		System.out.println(sup.get());
		
	}
}
