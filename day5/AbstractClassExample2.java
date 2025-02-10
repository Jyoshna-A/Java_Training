package com.celcom.day5;


//MOST IMPORTANT BIT

abstract class Animal4
{
	String msg=greeting();
	abstract String greeting();
	
	
}
class Cat4 extends Animal4
{
	String greeting()
	{
		return "B";
	}
	
}
public class AbstractClassExample2{
	public static void main(String[] args)
	{
		Animal4 animal=new Cat4();
		System.out.println(animal.greeting());
		
				
	}

}

