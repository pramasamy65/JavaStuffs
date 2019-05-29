package com.handson.javaconcepts.java8;

import java.util.Arrays;
import java.util.List;

public class LamdaDemo {

	public static void main(String args[]) {

		List<Integer> list = Arrays.asList(100, 25, 3, -10, 15);
		// Without Lamda Functions
		list.sort(new SortingComparator());
		System.out.println(list);
		// With Lamda Functions
		list.sort((a, b) -> a.compareTo(b));
		System.out.println(list);
		// With Lamda Functions
		list.sort((Integer a, Integer b) -> {
			return b.compareTo(a);
		});
		System.out.println(list);
	}

}
