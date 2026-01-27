package com.opps;

public class Wrapper_class_demo {

	public static void main(String[] args) {
		
		Integer i=new Integer(10);
		System.out.println(i);
		
		//by using valueOf() converting String/primitive to the wrapper object
				Boolean b1=Boolean.valueOf("true");
				System.out.println(b1);
				
				Integer i1=new Integer(109);
				System.out.println(i1.toString());
				Float f1=new Float(28.07);
				System.out.println(f1.toString());
				
				Integer i2=Integer.valueOf(220);
				System.out.println("byte value ="+i2.byteValue());
				System.out.println("short value ="+i2.shortValue());
				System.out.println("int value ="+i2.intValue());
				System.out.println("long value ="+i2.longValue());
				System.out.println("float value ="+i2.floatValue());
				
				String s1="18";
				String s2="07";
				System.out.println(s2);
				int a=Integer.parseInt(s1);
				float f2=Float.parseFloat(s2);
				System.out.println(a+f2);
				
				Integer i3=new Integer(10);
				System.out.println(i3.toString());
				Float f3=new Float(10.7);
				System.out.println(f3.toString());
				
				
				String s3="927";
				int a2 =Integer.parseInt(s3);
				System.out.println(a2);
	}

}
