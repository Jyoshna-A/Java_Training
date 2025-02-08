package com.celcom.day5;
import java.util.Scanner;

class Person
{
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	void displayDetails()
	{
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
	}
}
public class Assignment1 {
	public static void main(String[] args)
	{
		
		Person person1=new Person("Ramya",18);
		Person person2=new Person("Swetha",34);
		person1.displayDetails();
		person2.displayDetails();
	}

}
