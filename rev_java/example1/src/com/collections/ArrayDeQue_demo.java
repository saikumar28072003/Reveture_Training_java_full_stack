package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQue_demo {

	public static void main(String[] args) {
		
		Deque<String> adq=new ArrayDeque<>();
		adq.offer("google.com");
		adq.offer("java2s.com");
		adq.offer("Gemini.com");
		
		System.out.println(" Deque : "+adq);
		
		//peek 
		
		System.out.println(" peek () : "+adq.peek());
		System.out.println(" poll ()  : "+adq.poll());
		
		  System.out.println("After poll: " + adq);
		  
		  // Deque special methods (both ends)
	        adq.addFirst("startpage.com");
	        adq.addLast("stackoverflow.com");

	        System.out.println("After addFirst/addLast: " + adq);

	        System.out.println("peekFirst(): " + adq.peekFirst());
	        System.out.println("peekLast(): " + adq.peekLast());

	        System.out.println("pollFirst(): " + adq.pollFirst());
	        System.out.println("pollLast(): " + adq.pollLast());

	        System.out.println("Final: " + adq);
	        
	     // Stack-like using Deque
	        adq.push("login-page");   // addFirst
	        System.out.println("After push: " + adq);
	        System.out.println("pop(): " + adq.pop()); // removeFirst
	}
}
