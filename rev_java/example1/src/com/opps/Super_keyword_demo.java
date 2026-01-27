package com.opps;

class Parent3 {
	void m1() {
		System.out.println("parent cls-m");
	}
}

class Child3 extends Parent3 {
	void m1() {
		System.out.println("child cls-m1");
	}

	void m2() {
		this.m1();
		System.out.println("child cls-m2");
		super.m1();
	}

}
public class Super_keyword_demo {

	public static void main(String[] args) {
		
		Child3 c = new Child3();
		c.m2();
	}

}
