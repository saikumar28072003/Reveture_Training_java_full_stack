package com.opps;

public class Auto_Boxing {

	public static void main(String[] args) {
		
		Integer a = new Integer (15); 
		int b= a; 
		int c=70;
		Integer d=c;
		System.out.println( "a value = "+a);
		System.out.println(a.getClass().getName());	
		System.out.println("y datatype (boxed)= " + d.getClass().getName());
		System.out.println( "I value = "+b);
		System.out.println(((Object) b).getClass().getName());
		
		float f=67.7f;
		
		Float f1=new Float(f);
		System.out.println(f1);
		
		Float f2=new Float("18");
		System.out.println(f2);
		
//		Float f3=new Float("sai");
//		System.out.println(f3);
		
		Integer i1=new Integer(2);
		System.out.println(i1);
		
//		Integer i2=new Integer("five");
//		System.out.println(i2);
	}

}
