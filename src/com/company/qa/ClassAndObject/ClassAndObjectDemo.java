package com.company.qa.ClassAndObject;

public class ClassAndObjectDemo {

	
	// Class vars:
			String carName;
			int modelYear;
			String color;
			double price;

	
	
	public static void main(String[] args) {

				
	
			int model = 2022; // local variable
			
			String jainasCarModel = "Jaina's Lexus model is ";
			
			String carName = "Lamborgini"; // object of the class
			
			String geethasCarPrice = "Geetha's car price is $";
			
			// Crate an object for class
			
			ClassAndObjectDemo JainaCarObj = new ClassAndObjectDemo();
			
			JainaCarObj.carName = "Lexus";
			JainaCarObj.modelYear = 2015;
			JainaCarObj.price = 45000.65;
			
			System.out.println(model);
			System.out.println(carName);
			
			System.out.println(JainaCarObj.carName);
			System.out.println( jainasCarModel +JainaCarObj.modelYear);
			
			
			ClassAndObjectDemo geethaCarObj = new ClassAndObjectDemo();
			
			geethaCarObj.carName = "Honda";
			geethaCarObj.modelYear = 2020;
			geethaCarObj.price = 30000.45;
			
			System.out.println( geethasCarPrice + geethaCarObj.price);
			
		
		
	}

}
