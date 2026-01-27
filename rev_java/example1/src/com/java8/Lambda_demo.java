package com.java8;

public class Lambda_demo {

	static void sayHello() {
		System.out.println("Hello from Task");
	}

	void sayHelloNonStatic() {
		System.out.println("Hello from Non static function");
	}
	public static void main(String[] args) {

		// without lambda
//		Runnable task=new Runnable() {
//			public void run() {
//				System.out.println(" Hello from Task");
//			}
//		};
		

		// using lambda

//		Runnable task =() -> System.out.println("hello sai kumar!!");

		// with Method Reference with static method ::
//		Runnable task = Lambda_demo::sayHello;

		// method reference with non-static mehtod;

  
		Lambda_demo lambdaDemo = new Lambda_demo();
		Runnable task = lambdaDemo::sayHelloNonStatic;
		Thread t1 = new Thread(task);
		t1.start();
	}
}
