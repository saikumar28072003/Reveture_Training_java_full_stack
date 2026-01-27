package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_demo {

	public static void main(String[] args) {
		
		PriorityQueue < String > qe = new PriorityQueue < String > ();
		qe.add ("sai");
		qe.add ("nikhil");
		qe.add ("divya");
		qe.add ("mubeen");
		qe.add ("nikki");
		System.out.println ("head:" + qe.element ());
		System.out.println ("head:" + qe.peek ());
		System.out.println ("Iterating the queue elements:");
		Iterator itr = qe.iterator ();
		while (itr.hasNext ())
		{
		System.out.println (itr.next ());
		}
		qe.remove ();
		//Removes and returns the head element.
		//If the queue is empty → ❌ throws Exception: NoSuchElementException
		qe.poll ();
		//Removes and returns the head element.
		//If the queue is empty → ✅ returns null (no exception)
		System.out.println ("After removing two elements:");
		Iterator < String > itr2 = qe.iterator ();
		while (itr2.hasNext ())
		{
		System.out.println (itr2.next ());
		}

	}
}
