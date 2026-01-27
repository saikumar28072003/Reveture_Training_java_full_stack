package com.opps;
class fruit{
	
}
public class Instance_of extends fruit {

	public static void main(String[] args) {
		
		Instance_of i1=new Instance_of();
		Object o=new Object();
		String s="saikumar";
		Throwable t=new Throwable();
		//it returns only true or false
		System.out.println(i1 instanceof fruit);
		System.out.println(i1 instanceof Object);
		System.out.println(s instanceof Object);
		System.out.println(o instanceof Throwable);
		System.out.println(t instanceof Throwable);

	}

}
