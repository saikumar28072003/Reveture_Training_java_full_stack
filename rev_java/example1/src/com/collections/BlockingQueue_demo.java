package com.collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueue_demo {

	public static void main(String[] args) throws Exception {

		BlockingQueue<String> or = new ArrayBlockingQueue<>(3); // fixed size

		// Producer
		System.out.println("offer Order1: " + or.offer("Order1"));
		System.out.println("offer Order2: " + or.offer("Order2"));

		// Queue full now (offer returns false)
		// System.out.println("offer Order3 (queue full): " + orders.offer("Order3"));

		System.out.println("Current queue: " + or);

		// take / put (blocking style demo without threads)
		System.out.println("poll(): " + or.poll());
		System.out.println("After poll: " + or);

		// Now space is available
		or.put("Order3"); // will not block now
		System.out.println("After put Order3: " + or);

		// take removes head
		System.out.println("take(): " + or.take());
		System.out.println("Remaining: " + or);

		// remainingCapacity
		System.out.println("remainingCapacity(): " + or.remainingCapacity());
	}
}
