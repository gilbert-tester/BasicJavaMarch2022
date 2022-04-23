package com.company.qa.arrayConcept;

public class ArrayString {

	public static void main(String[] args) {

		// Student info
		
		String student[] = new String [3];
		
		student [0] = "Tom";
		student [1] = "Class 11";
		student [2]= "A";
		
	//	System.out.println(student[1]);
		
		
		for (int i = 0; i < student.length; i++) {
			
			System.out.println(student[i]);
		}
		
		
	}

}
