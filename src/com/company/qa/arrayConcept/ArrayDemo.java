package com.company.qa.arrayConcept;

public class ArrayDemo {

	public static void main(String[] args) {

		int mobileNumber[] = new int[5]; // declaration and instantiation
		// 0,1,2,3,4

		mobileNumber[0] = 90947938; // initialize
		mobileNumber[1] = 7953453;
		mobileNumber[2] = 534534534;
		mobileNumber[3] = 231432423;
		mobileNumber[4] = 534543535;
		
		//System.out.println(a[1]);
		
		
		for (int i = 0; i < mobileNumber.length; i++) { // length is the property of array
			
			System.out.println(mobileNumber[i]);
		}
		

	}

}
