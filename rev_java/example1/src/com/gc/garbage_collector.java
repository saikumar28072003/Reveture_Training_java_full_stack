package com.gc;

public class garbage_collector {
	
	public void finalize() {
		System.out.println("Garbage Collection performed by JVM");
	}

	public static void main(String[] args) {
		
		garbage_collector g1=new garbage_collector();
		garbage_collector g2=new garbage_collector();
		
		System.out.println(g1);
		System.out.println(g2);
		
		g1=null;g2=null;
		
		System.out.println(g1);
		System.out.println(g2);
		
		System.gc();
	}

}
