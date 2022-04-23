package com.company.qa.methods;

public class MethodConcepts {
	
	// class vars
	// class methods
	// data members of the class - to call them, you need to create object o the class
	// we cannot create method inside of a method.

	public static void main(String[] args) {

	
		System.out.println("Starting ....... ");
		
		
		MethodConcepts obj = new MethodConcepts();
		obj.test();
		obj.getTotal();
		
		String s1 = obj.getTrainingName();
		System.out.println(s1 + " with TechAgility");
		
		
		int i1 = obj.getTotalAmount();
		
		System.out.println(i1);
		
				
	}
	
	
	// 1. no input and no return
	// 2. void - it will not return anything or no return
	
	public void test() {
		
		System.out.println("Test method");
	}
	
	public void getTotal () {
		
		System.out.println("This is get total method ....");
		
		int a = 100;
		int b = 200;
		
		int total = a +b;
		
		System.out.println(total);
		
	}
	
	
	// 3. No input but some return
	// Return type is String
	
	public String getTrainingName() {
		
		System.out.println("This is our training name ... ");
		
		String training = "Automation Engineering";
		return training;
		
	}
	
	public int getTotalAmount() {
		
		
		System.out.println("This is get total amount method");
		
		int fee = 100;
		int tax = 20;
		int amount = fee + tax;

		return amount;
		
		
	}
	
	
	
	
	

}
