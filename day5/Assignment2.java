package com.celcom.day5;

import java.util.Scanner;
class Dog
{
	String name;
	String breed;
	Dog(String name,String breed)
	{
		this.name=name;
		this.breed=breed;
	}
	void displayDetails()
	{
		System.out.println("The name of Dog is "+name);
		System.out.println("The name of breed is "+breed);
	}
	void setName(String name)
	{
		this.name=name;
	}
	void setBreed(String breed)
	{
		this.breed=breed;
	}
	void getName()
	{
		System.out.println("The name is "+name);
	}
	void getBreed()
	{
		System.out.println("The breed is "+breed);
	}
	
}
public class Assignment2 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Initial Parametrs");
		Dog d=new Dog("kutty","Labrador Retriever");
		d.getName();
		d.getBreed();
		d.setName("Puppy");
		d.setBreed("Foreign");
		System.out.println("Updated Parameters");
		d.getName();
		d.getBreed();
		
	}

}
