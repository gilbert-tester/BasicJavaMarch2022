package com.company.qa.switchStament;

public class SwitchStatementDemo {

	public static void main(String[] args) {

		int marks = -1;
		
		String studentName = "Gilbert";
		
		
		switch (studentName) {
		case "Prima":
			marks = 90;
			break;
			
		case "Mahfuza":
			marks = 85;
			break;
			
		case "Geetha":
			marks = 80;
			break;
			
		case "Koko":
			marks = 100;
			break;

		default:
			
			System.out.println("student not found .." + studentName);
			
			break;
		}
		
		System.out.println(studentName + " got " + marks  + " Marks" );
		
	}

}
