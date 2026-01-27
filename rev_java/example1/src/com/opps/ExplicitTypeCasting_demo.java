package com.opps;

public class ExplicitTypeCasting_demo {

	public static void main(String[] args) {
		
		double distance=18.18;
		
		int display=(int)distance;
		
		System.out.println("Actual distance :"+distance);
		System.out.println("Displayed Kilometer :"+display);
		
		char grade='A';
		int gradeCode=(int) grade;
		char ch=(char) gradeCode;
		System.out.println("Grade ="+grade);
		System.out.println("Grade code= "+gradeCode);
		System.out.println("charat to Grade = "+ch);

	}

}
