package com.collections;

import java.util.Stack;
import java.util.Vector;

public class Vector_demo {

	public static void main(String[] args) {
		
		Vector v=new Vector();
		for (int i=0;i<10 ;i++ )
		{
		v.addElement(i);
		}
		System.out.println(v);
		v.addElement("saikumar");
		System.out.println(v);
		v.removeElement(0);
		System.out.println(v);
		v.clear();
		System.out.println(v);
		System.out.println("============================");
		Stack s=new Stack();
		s.push("A");
		s.push(10);
		s.push("aaa");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println("Top Element " +s.peek());
		System.out.println(s.search("A"));

	}

}
