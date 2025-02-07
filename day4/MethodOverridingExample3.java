package com.celcom.day4;
class Animal2
{
	int a=10;  // if varaible not there means we get compile time error
	void move()
	{
		System.out.println("You cant define");
	}
	
}
class Cat2 extends Animal2
{
	int a=20;
	void move()
	{
		System.out.println("Cat will move by Walk ");
	}
	
}
public class MethodOverridingExample3 {
	public static void main(String[] args)
	{
		Animal2 animal;
		animal=new Cat2();
		animal.move();
		System.out.println(animal.a);//Variables cannot be overridden in DMD
				
	}

}
