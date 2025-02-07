package com.celcom.day4;
//MOST IMPORTANT BIT

class Animal4
{
	String msg=greeting();
	String greeting()
	{
		return "A";
	}
	
}
class Cat4 extends Animal4
{
	String greeting()
	{
		return "B";
	}
	
}
public class MethodOverridingExample5{
	public static void main(String[] args)
	{
		Animal4 animal=new Cat4();
		System.out.println(animal.msg);
		
				
	}

}

