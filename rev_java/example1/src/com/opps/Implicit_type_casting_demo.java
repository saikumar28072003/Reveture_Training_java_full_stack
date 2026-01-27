package com.opps;

public class Implicit_type_casting_demo {

	public static void main(String[] args) {
		
		int items =18;
		double itemsDouble=items; //implicit type cast
		
		double pricePerItem=88.18;
		double total= itemsDouble*pricePerItem;
		
		System.out.println("Items ="+items);
		System.out.println("Total bill = "+total);

	}

}
