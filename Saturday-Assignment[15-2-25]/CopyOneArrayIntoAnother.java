package com.celcom.Saturday2;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
public class CopyOneArrayIntoAnother 
{
public static void main(String[] args) throws CloneNotSupportedException
{
	List<Integer> list=new ArrayList<>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the elments and give -1 when ever u wnat to stop adding elements ");
	int n;
	while((n=sc.nextInt())!=-1)
	{
		list.add(n);
	}
	System.out.println(list);
	System.out.println("Creating another copy");
	System.out.println(list.hashCode());
	List<Integer> list1=new ArrayList<>(list);
	System.out.println("Copy of Arraylist "+list1);
	System.out.println(list1.hashCode());
	
}
}
