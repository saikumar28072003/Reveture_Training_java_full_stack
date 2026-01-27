package com.sync;

class BookingSystem {
	private final Object roomLock = new Object();
	private final Object paymentLock = new Object();

//	public void bookRoomThenPay() {
//		synchronized (roomLock) {
//			sleep(50);
//			synchronized (paymentLock) {
//				System.out.println("Booked room & paid");
//			}
//		}
//	}
//
//	public void payThenBookRoom() {
//		synchronized (paymentLock) {
//			sleep(50);
//			synchronized (roomLock) {
//				System.out.println("Paid & booked room");
//			}
//		}
//	}

	public void bookRoomThenPay() {
		synchronized (roomLock) {
			synchronized (paymentLock) {
				System.out.println("Booked room & paid");
			}
		}
	}

	public void payThenBookRoom() {
		// IMPORTANT: same order (roomLock -> paymentLock)
		synchronized (roomLock) {
			synchronized (paymentLock) {
				System.out.println("Paid & booked room");
			}
		}
	}

	private void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException ignored) {
			System.out.println(ignored.getMessage());
		}
	}
}

public class DeadLock_demo {

	public static void main(String[] args) {

		BookingSystem bs = new BookingSystem();

		Thread t1 = new Thread(bs::bookRoomThenPay, "T1");
		Thread t2 = new Thread(bs::payThenBookRoom, "T2");

		t1.start();
		t2.start();
	}

}
