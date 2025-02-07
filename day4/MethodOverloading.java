package com.celcom.day4;

public class MethodOverloading 
{
	void myMethod(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
			fact=fact*i;
		System.out.println("The Factorail of Number is "+fact);
	}
	void myMethod(int a,int b)
	{
		int sum=a+b;
		System.out.println("The sum is "+sum);
	}
	void myMethod(String a)
	{
		System.out.println("Hi hello "+a);
		
	}
	public static void main(String[] args)
	{
		MethodOverloading  a=new MethodOverloading();
		a.myMethod(5);
		a.myMethod(1,2);
		a.myMethod("Joshi");
		
	}

}
