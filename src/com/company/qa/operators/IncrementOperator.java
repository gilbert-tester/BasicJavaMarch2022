package com.company.qa.operators;

public class IncrementOperator {

	public static void main(String[] args) {

		
		int a = 1;
		
		int b = a++; // post increment
		
		System.out.println(a); // this is 2
		System.out.println(b); // this is 1
		
	//	int d = c++;
		int c = -1;
		int d = c++;
		
		System.out.println(c); // 0
		System.out.println(d);// -1
		
		
		
		int j = 1;
		int k = ++j; // pre increment
		
		System.out.println(j);
		System.out.println(k);
		
		int m = -5;
		int n = ++m;
		
		System.out.println(m); //-4
		System.out.println(n); //-4
		
		
		
	}

}
