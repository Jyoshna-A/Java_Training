package com.celcom.day4;


class Animal
{
	void move()
	{
		System.out.println("You cant define");
	}
	void eat()
	{
		System.out.println("cant define");
	}
	
}

class Cat extends Animal
{
	void move()
	{
		System.out.println("Cat will move by Walk ");
	}
	void eat()
	{
		System.out.println("Cat will eat rat ");
	}
}

class Parrot extends Animal
{
	void move()
	{
		System.out.println("Parrot will move by Fly ");
	}
	void eat()
	{
		System.out.println("Parrot will eat fruits ");
	}
}


class Fish extends Animal
{
	void move()
	{
		System.out.println("Fish will move by swim");
	}
	void eat()
	{
		System.out.println("Fish will eat Sea plants");
	}
}




public class MethodOverridingExample2 {
	public static void main(String[] args)
	{
		Animal animal;
		animal=new Cat();
		animal.move();
		animal=new Parrot();
		animal.move();
		animal=new Fish();
		animal.move();
		animal=new Cat();
		animal.eat();
		animal=new Parrot();
		animal.eat();
		animal=new Fish();
		animal.eat();
		
	}

}
