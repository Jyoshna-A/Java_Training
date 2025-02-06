
package com.celcom.day3;
@SuppressWarnings("unused")
class A4
{
	A4()
	{
		System.out.println("Super class Constructor");
	}
	A4(int a)
	{
		System.out.println("Super class parameterized  Constructor");
	}
	void displaysuper()
	{
		
	}
}
@SuppressWarnings("unused")
class B4 extends A4
{
	B4()
	{
		this(10);
		System.out.println("Sub class Constructor");
	}
	B4(int a)
	{
		super(12);
		System.out.println("Sub class paramterized Constructor");
	}
	void displaychild()
	{
		
	}
}
public class Dmd
{
	@SuppressWarnings("unused")
	public static void main(String args[])
	{
				A4 obj =new B4();
				obj.
		
	}

}
