package com.celcom.day10;
import java.util.List;

import java.util.Scanner;

import java.util.ArrayList;
class Usecase
{
	List<Object> lst1=new ArrayList<>();
	
	void addTask(String task)
	{
	    lst1.add(task);
	    System.out.println("Task added ");
	}
	void viewTasks()
	{
		System.out.println(lst1);
	}
	void markCompleted(String task)
	
	{
		lst1.set(lst1.indexOf(task),0);
		System.out.println("Task completed ");
		viewTasks();
	}
void deleteTask(String task)
	
	{
		lst1.remove(task);
		System.out.println("Task Deleted ");
		viewTasks();
	}
void searchTask(String task)

{
	if(lst1.contains(task))
	{
	System.out.println("Task Present at index "+ lst1.indexOf(task));
	
	}
	else
	{
		System.out.println("Task Not Present");
	}
}
	
	
}
public class P3 {
	public static void main(String[] args)
	{
		Usecase usecase=new Usecase();
		System.out.println("1)Add a new tasK " + 
				"2) View all tasks\r\n" + 
				"3) Mark a task as completed\r\n" + 
				"4) Delete a task\r\n" + 
				"5) Search for tasks\r\n" + 
				"");
		
		while(true)
		{
			System.out.println("Enter the input");
			Scanner sc=new Scanner(System.in);
		switch(sc.nextInt())
		{
		case 1:
			System.out.println("Enter the task");
			String s=sc.next();
			usecase.addTask(s);
			break;
		case 2:
			
			usecase.viewTasks();
			break;
		case 3:
			System.out.println("Enter the task");
			String s1=sc.next();
			usecase.markCompleted(s1);
			break;
		case 4:
			System.out.println("Enter the task");
			String s2=sc.next();
			usecase.deleteTask(s2);
			break;
		case 5:
			System.out.println("Enter the task");
			String s3=sc.next();
			usecase.searchTask(s3);
			break;
		case 6:
			System.out.println("Program exited");
			return;
		}
		}
	}
}
