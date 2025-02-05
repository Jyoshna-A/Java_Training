package com.celcom.day2;

public class ArrayDeclaration {

	public static void main(String[] args)
	{
		int[] arr= {10,20,30,40};
		System.out.println("The Length of array "+arr.length);
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+" ");
			sum=sum+i;
		}
		System.out.println();
		System.out.print("Sum is "+sum);
	}

}
