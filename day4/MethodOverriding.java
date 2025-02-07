package com.celcom.day4;


class SuperClass
{
	void myMethod()
	{
		System.out.println("Greeting in Superclass");
	}
}
class SubClass extends SuperClass
{
	void myMethod()
	{
		System.out.println("Greeting in Subclass");
	}
}
public class MethodOverriding 
{
	
	
	public static void main(String[] args)
	{
		SubClass obj=new SubClass();
		obj.myMethod();
	}

}
