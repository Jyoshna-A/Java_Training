
package com.celcom.day4;

public class ConstructorOverloadingExample1
{
    ConstructorOverloadingExample1(String a,String b)
	{
		System.out.println("The Concatenation of two Strings by constructor overloading  is "+(a+b));
	}
	ConstructorOverloadingExample1(int a,int b)
	{
		System.out.println("The Concatenation of two Integer values is "+(a+""+b));
	}
	ConstructorOverloadingExample1(double a,double b)
	{
		System.out.println("The Concatenation of two Double values is "+(a+""+b));
	}

	
	public static void main(String[] args)
	{
		ConstructorOverloadingExample1 obj=new ConstructorOverloadingExample1("Atmakuru", "Jyoshna");
		ConstructorOverloadingExample1 obj1=new ConstructorOverloadingExample1(100,200);
		ConstructorOverloadingExample1 obj2=new ConstructorOverloadingExample1(5.4,2.4);
	}

}
