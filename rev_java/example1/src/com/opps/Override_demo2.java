package com.opps;

class Payment {
	void pay(double amount) {
		System.out.println("Processing generic payment of ₹" + amount);
	}
}

class CreditCardPayment extends Payment {

	void pay(double amount) {
		System.out.println("Processing Credit Card payment of ₹" + amount);
		System.out.println("Step: Validate card -> Ask OTP -> Deduct amount");
	}
}

class UPIPayment extends Payment {

	void pay(double amount) {
		System.out.println("Processing UPI payment of ₹" + amount);
		System.out.println("Step: Verify UPI ID -> Enter PIN -> Transfer amount");
	}
}

class CashOnDelivery extends Payment {

	void pay(double amount) {
		System.out.println("Cash on Delivery selected for ₹" + amount);
		System.out.println("Step: Deliver item -> Collect cash");
	}
}

public class Override_demo2 {

	public static void main(String[] args) {

		Payment p1 = new CreditCardPayment();
		p1.pay(8900);

		System.out.println("================");

		Payment p2 = new UPIPayment();
		p2.pay(350);

		System.out.println("==================");

		Payment p3 = new CashOnDelivery();
		p3.pay(7500);
	}

}
