
package com.celcom.day4;

public class ConstructorOverloadingExample2
{
    ConstructorOverloadingExample2(String a,String b)
	{
    	this(100,200);
		System.out.println("The Concatenation of two Strings by constructor overloading  is "+(a+b));
	}
	ConstructorOverloadingExample2(int a,int b)
	{
		this(5.4,2.4);
		System.out.println("The Concatenation of two Integer values by constructor overloading is "+(a+""+b));
	}
	ConstructorOverloadingExample2(double a,double b)
	{
		System.out.println("The Concatenation of two Double values by constructor overloading is "+(a+""+b));
	}

	
	public static void main(String[] args)
	{
		ConstructorOverloadingExample2 obj=new ConstructorOverloadingExample2("Atmakuru", "Jyoshna");
		
	}

}
