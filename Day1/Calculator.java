package com.celcom.day1;
import java.util.*;
public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two Numbers ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("1.ADD 2.SUB 3.MUL 4.DIV 5.REMAINDER");
		
		while(true)
		{
			System.out.println("Do u want to continue");
			Boolean b=sc.nextBoolean();
			if(b)
			{
			System.out.print("Enter ur Choice");
			int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("The Sum is "+(num1+num2));
			break;
		case 2:
			System.out.println("The Subtraction is "+(num1-num2));
			break;
		case 3:
			System.out.println("The Multiplication is"+(num1*num2));
			break;
		case 4:
			System.out.println("The Division is "+(num1/num2));
			break;
		case 5:
			System.out.println("The Remainder is "+(num1%num2));
		
		}
			}
		else
		{
			System.out.println("Thanks for ur time");
			break;
		}
		}
		}
		
	
	}


