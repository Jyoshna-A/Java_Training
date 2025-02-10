package com.celcom.day5;

class Employee
{
	String name;
	String jobtitle;
	double salary;
	void setSalary(double salary)
	{
		this.salary=salary;
	}
	void getsalary()
	{
		System.out.println("The Salary is "+salary);
	}
	void display()
	{
		System.out.println("The Name of Employee is "+name);
		System.out.println("The Jobtitle of Employee is "+jobtitle);
		System.out.println("The Salary of Employee is "+salary);
	}
}
public class Assignment6 {
	public static void main(String[] args)
	{
		Employee e=new Employee();
		e.setSalary(25000);
		e.getsalary();
	}

}
