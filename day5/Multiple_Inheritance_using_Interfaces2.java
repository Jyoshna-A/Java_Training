package com.celcom.day5;


interface Interface11
{
	int a=10;  
}

interface Interface22
{
	int b=20;
}
interface Interface33 extends Interface11,Interface22
{
	void division();
	
}
class Division implements Interface33
{
	
	public void division()
	{
		int a=Interface1.a;
		int b=Interface2.b;
		System.out.println("The division of two numbers is "+(a/b));
	}
	
	
}


public class Multiple_Inheritance_using_Interfaces2 {
	public static void main(String[] args)
	{
	Interface33 three=new Division();
	three.division();
	}
}

