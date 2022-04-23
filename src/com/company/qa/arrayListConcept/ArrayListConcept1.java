package com.company.qa.arrayListConcept;

import java.util.ArrayList; // Coming from Java util package 

public class ArrayListConcept1 {

	public static void main(String[] args) {

		// ArrayList -> Dynamic Array
		// There is no limit of size
		// default class in Java
		// We have to create an object of ArrayList

		ArrayList<Object> ar = new ArrayList<Object>();

//		System.out.println(ar.size()); // before assigning value

		ar.add(100); // 0
		ar.add(200); // 1

//		System.out.println(ar.size()); // after assigning value

		ar.add(300);
		ar.add(400);

//		System.out.println(ar.size()); // after assigning value

		ar.add(500); 
		ar.add(600); // 5

	//	System.out.println(ar.size()); // after assigning value
		
		
		ar.add(33.44);
		ar.add('b');
		
		ar.add("Java");
		
		ar.add(true);
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5)); // old 5
		
		ar.remove(5); // remove method
		
		System.out.println(ar.size());
		
		System.out.println(ar.get(5)); // new 5
		
	//	System.out.println(ar.get(10)); // IndexOutOfBoundsException: 
		

		
		for (int i = 0; i < ar.size(); i++) {
			
			System.out.println(ar.get(i));
		}
		
		
		
		
	}

}
