package com.celcom.day10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class P4 {
	public static void main(String[] args)
	{
		List<Integer>  arr1=new ArrayList<>();
		List<Integer>  arr2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		int i;
		while((i=sc.nextInt())!=-1)
		{
			arr1.add(i);
		}
		System.out.println("The elements in the array are "+arr1);
		while((i=sc.nextInt())!=-1)
		{
			arr2.add(i);
		}
		System.out.println("The elements in the array are "+arr2);
		
        if(arr1.size()==arr2.size())
        {
		for(i=0;i<arr1.size();i++)
		{
			if(arr2.contains(arr1.get(i))!=true)
			{
				
				break;
			}
			else
			{
				continue;
			}
		}
        }
        else
        {
        	System.out.println("Not-Equal");
        }
        
		if(i==arr1.size())
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
		
	}

}
