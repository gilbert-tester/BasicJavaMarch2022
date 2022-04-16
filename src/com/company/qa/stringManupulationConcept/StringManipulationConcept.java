package com.company.qa.stringManupulationConcept;

public class StringManipulationConcept {

	public static void main(String[] args) {

		String s = "This is my java code and I am happy";
		
		System.out.println(s.length());
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(6));
		
//		System.out.println(s.charAt(35));
		//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 35
		
		System.out.println(s.indexOf("j"));
		System.out.println(s.indexOf("s")); //1st occurrence of s
		
		System.out.println(s.indexOf("s", s.indexOf("s")+1)); // 2nd occurrence of s
		
		/*
		
		System.out.println(s.indexOf("java")); // 11
		System.out.println(s.indexOf("koko")); // -1
		
		//trims
		
		
		String st = "    hello world      ";
		
		System.out.println(st); // without trim
		
		System.out.println(st.trim()); // with trim
		
		//contains:
		
		String message = "Welcome to Amazon";
		
//		message.
		
	//	System.out.println(message.contains("Welcome")); // boolean value
	//	System.out.println(message.contains("Ebay")); // boolean value
		
		
		// Comparison
		
		String title_actual = "Google";
		String title_expected = "google";
		
		
		System.out.println(title_actual.equals(title_expected));
		System.out.println(title_actual.equalsIgnoreCase(title_expected));
		
		
		//split
		
		String lang = "Java_Python_Ruby_JavaScript";
		
		String langValue[] = lang.split("_");
		
		System.out.println(langValue.length);
		
		System.out.println(lang.toUpperCase());
		System.out.println(lang.toLowerCase());
		
		//System.out.println(lang.);
		
		
//		for (int i = 0; 
//				i<langValue; i++) {
//			
//			System.out.println(langValue[i]);
//		}
				
				
				*/
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
		
	}

}
