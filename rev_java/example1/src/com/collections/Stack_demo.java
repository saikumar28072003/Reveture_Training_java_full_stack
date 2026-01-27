package com.collections;

import java.util.Stack;

public class Stack_demo {

	public static void main(String[] args) {

		Stack<Double> s = new Stack<Double>();
	     s.push(90.2);
	     s.push(67.2);
	     s.push(34.2);
	     s.push(89.2);
	     s.push(70.2);
	     System.out.println(s);
	     System.out.println(s.pop());
	     System.out.println(s);
	     System.out.println(s.peek());
	     System.out.println(s);
	}

}
