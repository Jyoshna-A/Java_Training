
package com.celcom.day4;


class SuperClass1
{
	void myMethod()
	{
		System.out.println("Greeting in Superclass");
	}
}
class SubClass1 extends SuperClass1
{
	void myMethod()
	{
		System.out.println("Greeting in Subclass");
	}
}
public class MethodOverridingExample1 
{
	
	
	public static void main(String[] args)
	{
		SuperClass1 obj=new SubClass1();
		obj.myMethod();
	}

}
