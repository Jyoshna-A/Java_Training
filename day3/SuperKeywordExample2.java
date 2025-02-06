package com.celcom.day3;



class A1
{
	A1()
	{
		System.out.println("Super class Constructor");
	}
	A1(int a)
	{
		System.out.println("Super class parameterized  Constructor");
	}
}
class B1 extends A1
{
	B1()
	{
		System.out.println("Sub class Constructor");
	}
	B1(int a)
	{
		System.out.println("Sub class paramterized Constructor");
	}
}
public class SuperKeywordExample2
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
		B1 obj =new B1(10);
		
	}

}
