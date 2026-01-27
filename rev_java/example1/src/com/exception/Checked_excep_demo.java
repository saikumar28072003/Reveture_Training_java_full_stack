package com.exception;

public class Checked_excep_demo {

	public static void main(String[] args) {

		int a = 18;
		int b = 0;
		System.out.println("a value = " + a);
		System.out.println("b value = " + b);
		int c = a / b;
		System.out.println("c value = " + c);

//		ArithmeticException
		try {
			int totalSalary = 7500;
			int employees = 0;
			int avg = totalSalary / employees; // divide by zero
			System.out.println("Average: " + avg);
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero, Employees count is 0.");
		}

		// NullPointerException
		try {
			String customerName = null;
			System.out.println(customerName.length()); // error
		} catch (NullPointerException e) {
			System.out.println("Customer name is null...");
		}

     //ArrayIndexOutOfBoundsException
		try {
			String[] products = { "gundu", "sai", "harish" };
			System.out.println(products[5]); // invalid index
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid product index selected.");

		}
		
		//NumberFormatException 
		try {
            String king = "virat";
            int age = Integer.parseInt(king);
            System.out.println("Age: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Please enter age as a number only.");
        }

	}

}
