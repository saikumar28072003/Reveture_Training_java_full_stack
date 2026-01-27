package com.multithreading;

class PaymentTask extends Thread {
	public void run() {
		System.out.println("Payment started ...");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Payment Completed ...");
	}
}

class InvoiceTask extends Thread {
	public void run() {
		System.out.println("Invoice Generated!... ");
	}
}

public class Multithreading_with_join {

	public static void main(String[] args) throws InterruptedException {

		PaymentTask payment = new PaymentTask();
		InvoiceTask invoice = new InvoiceTask();

		payment.start();

		// It wait until payment finishes
		payment.join();

		invoice.start();
	}

}
