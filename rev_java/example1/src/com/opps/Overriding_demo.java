package com.opps;

class Parent {
	void property() {
		System.out.println("money+land+house");
	}

	void marry() {
		System.out.println("black girl"); // Overridden method
	}
}
class Child extends Parent {
	@Override
	void marry() {
		System.out.println("white girl/red girl"); // overriding method
	}

}

public class Overriding_demo {

	public static void main(String[] args) {

		Child c = new Child();
		c.property();
		c.marry();
		Parent p = new Parent();
		p.property();
		p.marry();
		
		Child c1=(Child)new Parent();
		c1.marry();
		c1.property();
	}

}
