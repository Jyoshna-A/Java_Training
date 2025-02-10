package com.celcom.day5;


interface AnimalPlan
{
	void move();
	void eat();
}
abstract class Animal implements AnimalPlan
{
	abstract public void move();
	
	abstract public void eat();
	
	
}

class Cat extends Animal
{
	public void move()
	{
		System.out.println("Cat will move by Walk ");
	}
	public void eat()
	{
		System.out.println("Cat will eat rat ");
	}
}

class Parrot extends Animal
{
	public void move()
	{
		System.out.println("Parrot will move by Fly ");
	}
	public void eat()
	{
		System.out.println("Parrot will eat fruits ");
	}
}


class Fish extends Animal
{
	public void move()
	{
		System.out.println("Fish will move by swim");
	}
	public void eat()
	{
		System.out.println("Fish will eat Sea plants");
	}
}





public class Interface_Example4_With_Abstract_Class {
	public static void main(String[] args)
	{
		AnimalPlan animal;
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
