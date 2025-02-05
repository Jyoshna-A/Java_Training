package com.celcom.day2;
import java.util.*;
public class ArrayExample2 
{
	public static void main(String[] args)
	{
		int[] arr=new int[5];
		int e=0,o=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the number");
			arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%2)==0)
			{
				e+=1;
			}
			else
			{
				o+=1;
			}
		}
		System.out.println("Even count is "+e);
		System.out.print("Odd Count is "+o);
		
	}

}
