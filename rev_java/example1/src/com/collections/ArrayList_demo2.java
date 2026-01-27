package com.collections;

import java.util.ArrayList;

class Customer {
	String name;
	int balance;
	int id;

//Costructor 
	Customer(String s, int i, int j) {
		name = s;
		balance = i;
		id = j;
	}

//toString() method is overridden to give a meaningful String representaion of each object.
	public String toString() {
		return "| ID : " + id + " | Name : " + name + "| Balance : " + balance;
	}
}

public class ArrayList_demo2 {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		// Creating Customer objects.
		Customer customer1 = new Customer("sai", 1000, 2);
		Customer customer2 = new Customer("nikhil", 7000, 3);
		Customer customer3 = new Customer("harish", 5000, 1);
		Customer customer4 = new Customer("mandy", 3000, 6);
		Customer customer5 = new Customer("mubeen", 6000, 4);
		// Storing objects in an ArrayList collection class.
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);

		for (Customer c : customerList)
			System.out.println(c);
	}

}
