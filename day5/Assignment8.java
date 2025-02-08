package com.celcom.day5;


class Animal
{
	void makeSound()
	{
		System.out.println("An animal will make sound");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("The cat will make sound as meow");
	}
}
public class Assignment8 {
	public static void main(String[] args)
	{
	Animal a=new Cat();
	a.makeSound();
	}

}
