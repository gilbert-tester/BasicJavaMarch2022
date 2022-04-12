package com.company.qa.operators;

public class DecrementOperator {

	public static void main(String[] args) {

		int a = 2;
		int b = a--; // post decrement
		
		System.out.println(a); // 1
		System.out.println(b); // 2
		
		
		int x = 2;
		int y = --x; // pre decrement
		
		System.out.println(x); // 1
		System.out.println(y);// 1
		
		
		int t = -99;
		int u = --t;
		
		System.out.println(t);
		System.out.println(u);
		
		
		
		
	}

}
