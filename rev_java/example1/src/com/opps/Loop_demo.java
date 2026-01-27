package com.opps;

public class Loop_demo {

	public static void main(String[] args) {
		
		for(int num=1;num<=5;num++)

		{
			System.out.println(num);
		}
         
		String empNames[]= {"sai","nikhil","harish"};
		 for(String empName:empNames)
		{
			System.out.println(empName);
		}
		
		
		for(int i=0;i<empNames.length;i++) {
			System.out.println(empNames[i]);
		}
		
		int num=18;
		while(num<=20)
		{
			System.out.println(num);
			num++;
		}
		do {
			System.out.println(num);
			num++;
		}while(num<=20);
	}

}
