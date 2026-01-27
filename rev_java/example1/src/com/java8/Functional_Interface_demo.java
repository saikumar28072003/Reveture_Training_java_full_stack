package com.java8;

interface  DiscountRule{
	double apply(double cartAmount);
}

class DiscountService
{
	public double finalAmount(double cartAmount , DiscountRule rule)
	{
		return cartAmount-rule.apply(cartAmount);
	}
}
public class Functional_Interface_demo {

	public static void main(String[] args) {
		
DiscountService service=new DiscountService();
		
		DiscountRule festivalDiscount= amount -> amount*0.30;
		DiscountRule premiumDiscount= amount -> amount*0.45;
		
		System.out.println("After Festival discount final Amount "+service.finalAmount(20000, festivalDiscount));
		System.out.println("After  Premium discount final Amount "+service.finalAmount(20000, premiumDiscount));
	}
}
