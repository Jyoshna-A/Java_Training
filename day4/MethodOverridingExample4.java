package com.celcom.day4;
class Animal3
{
	//U cannot override static methods
	static void move()
	{
		System.out.println("You cant define");
	}
	
}
class Cat3 extends Animal3
{
	int a=20;
	static void move()
	{
		System.out.println("Cat will move by Walk ");
	}
	
}
public class MethodOverridingExample4 {
	public static void main(String[] args)
	{
		Animal3 animal=new Cat3();
		animal.move();
		
				
	}

}
