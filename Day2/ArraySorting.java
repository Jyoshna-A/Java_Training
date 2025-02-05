package com.celcom.day2;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args)
	{
		int arr[]=new int[] {12,23,2,1,67};
		Arrays.sort(arr);
		System.out.println("The Minimal value is "+arr[0]);
		System.out.println("The Maximum value is "+arr[arr.length-1]);
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		
	}

}
