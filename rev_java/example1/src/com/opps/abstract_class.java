package com.opps;
abstract class test{
	abstract void m1();
	abstract void m2();
	abstract void m3();
}
abstract class test2 extends test{
	void m1() {
		System.out.println("m1-method-imp");
	}
	void m2() {
		System.out.println("m2-method-imp");
	}
//	void m3() {
//		System.out.println("m3-method-imp");
//	}
}
class test3 extends test2{
	void m3() {
		System.out.println("m3-method-imp");
	}
}
public class abstract_class {
   public static void main(String[] args) {
	
	   test3 t1=new test3();
	   t1.m1();
	   t1.m2();
	   t1.m3();
	   
}
}
