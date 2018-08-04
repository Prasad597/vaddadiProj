package com.pract.june;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class Execute {
	public static void main(String[] args) {
		Student s1 = new Student("H1");
		Student s2 = new Student("H1");
		Student s3 = new Student("H1");
		
		HashMap<Student, Integer> set = new HashMap<>();
		
		set.put(s1, 1);
		set.put(s2, 2);
		set.put(s3, 3);
		System.out.println(set.size());
	}

}
