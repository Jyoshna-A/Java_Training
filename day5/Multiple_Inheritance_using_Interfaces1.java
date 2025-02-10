package com.celcom.day5;
package com.celcom.day5;



interface Interface1
{
	int a=10;  
}

interface Interface2
{
	int b=20;
}
interface Interface3 extends Interface1,Interface2
{
	void multiplication();
	
}
class Multiplication implements Interface3
{
	
	public void multiplication()
	{
		int a=Interface1.a;
		int b=Interface2.b;
		System.out.println("The multiplication of two numbers is "+(a*b));
	}
	
	
}


public class Multiple_Inheritance_using_Interfaces1 {
	public static void main(String[] args)
	{
	Interface3 three=new Multiplication();
	three.multiplication();
	}
}
