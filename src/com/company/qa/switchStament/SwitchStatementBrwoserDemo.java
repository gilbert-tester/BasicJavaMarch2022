package com.company.qa.switchStament;

public class SwitchStatementBrwoserDemo {

	public static void main(String[] args) {

		//int marks = -1;
		
		String browser = "edge";
		
		
		switch (browser) {
		case "chrome":
			System.out.println("launch chorme");
			break;
			
		case "firefox":
			System.out.println("launch firefox");
			break;
			
		case "safari":
			System.out.println("launch safari");
			break;
			
		case "edge":
			System.out.println("launch edge");
			break;

		default:
			
			System.out.println("Please pass the correct browser " + browser);
			
			break;
		}
		
		
	}

}
