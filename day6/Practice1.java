package com.celcom.day6;
 


class duplicateArray extends Exception
{ 
	int i;
	duplicateArray()
	{
		
	}
	duplicateArray(int i)
	{
	this.i=i;
	}
	public String toString()
	{
		return i+" -Duplicate value";
	}
}
public class Practice1 {
	public static void main(String[] args)
	{
		try
		{
			int arr[]= {12,2,3,2,3,4,2};
			for(int i=0;i<arr.length;i++)
			{
				for(int j=i+1;j<arr.length;j++)
				{
					if(arr[i]==arr[j])
					{
						
						throw new duplicateArray(arr[i]);
						
						
					}
				}
			}
		}
		catch(duplicateArray e)
		{
			System.out.println(e);
		}
	}

}
