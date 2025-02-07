package com.celcom.day4;

public class MethodOverloadingExample2 
{
	
	void addition(int a,int b)
	{
		System.out.println("The sum of Integers is "+(a+b));
		
	}
	 void addition(double a,double b)
	{
		System.out.println("The sum of Double values is "+(a+b));
		
	}
	void addition(long a,long b)
	{
		System.out.println("The sum of Long values is "+(a+b));
		
	}
	public static void main(String[] args)
	{
		MethodOverloadingExample2 obj1=new MethodOverloadingExample2();
		obj1.addition(1, 2);
		obj1.addition(1.5, 2.5);
		obj1.addition(178996890L, 1623788789L);
		
	}

}
