package com.company.qa.dataConversion;

public class DataConversionConcept {

	public static void main(String[] args) {

		String x = "100";
		
		System.out.println(x + 20);
		
		
		// string to int conversion
		
		int i = Integer.parseInt(x); //  int type 100
		System.out.println(i + 20);
		System.out.println(i - 20);
		
		
//		String y = "100Test";
//		
//		int p = Integer.parseInt(y);
//		System.out.println(p + 20); // NumberFormatException
		
		
		// String to double
		
		String t = "12.33";
		
		System.out.println(t + 30);
		
		double d = Double.parseDouble(t);
		System.out.println(d + 30);
		System.out.println(d * 30);
		
		
		// int to String
		
		int lol = 100;
		System.out.println(lol + 20);
		
		
		System.out.println(lol + " " + 20);
		
		
		String sg = String.valueOf(lol); 
		System.out.println(sg);
		
		System.out.println(sg+20);
		
		
		
		
		
	}

}
