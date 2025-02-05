package com.celcom.day2;
import java.util.Scanner;
public class ClassesAndObjects 
{
	public static void main(String[] args)
	{
		Employee e =new Employee();
		Scanner sc=new Scanner(System.in);
		e.empid=sc.nextInt();
		e.name=sc.next();
		e.salary=sc.nextFloat();
		e.display();
		
	}

}
class Employee
{
	int empid;
	String name;
	float salary;
	void display()
	{
		System.out.println("The Employee id is "+empid);
		System.out.println("The Employee name "+name);
		System.out.println("The Salry of Employee is "+salary);
		
	}
	
}
