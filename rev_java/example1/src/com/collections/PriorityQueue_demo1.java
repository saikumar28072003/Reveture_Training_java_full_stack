package com.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_demo1 {

	public static void main(String[] args) {
		
		Queue<Integer> pt = new PriorityQueue<>();

        pt.offer(3); // low priority
        pt.offer(1); // high priority
        pt.offer(2);

        System.out.println("PriorityQueue (internal order may look random): " + pt);

        // peek: next to execute
        System.out.println("peek(): " + pt.peek()); // 1

        // poll in priority order
        System.out.println("Processing in priority order:");
        while (!pt.isEmpty()) {
            System.out.println("poll(): " + pt.poll());
        }
        
     // poll on empty -> null
        System.out.println("poll() on empty: " + pt.poll());
	}
}
