package com.company.qa.string;

public class StringConcatinate {

	public static void main(String[] args) {

		
		String x = "Hello ";
		String space = " ";
		String y = "World ";
		
		System.out.println(x+space+y);
		System.out.println(x+" "+y);
		
		int a = 300;
		int b = 200;
		
		System.out.println("The value of a is "+ a);
		System.out.println("The value of b is "+ b);
		
		
		
		System.out.println(x+a+b+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println("The sum of a and b is: "+ a+b);
		System.out.println("The sum of a and b is: "+ (a+b));
		
		
		String header = "Google";
		System.out.println("Page header is: "+ header);
		
		
		
		
		
	}

}
