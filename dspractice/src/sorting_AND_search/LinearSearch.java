package sorting_AND_search;

import java.util.Scanner;

public class LinearSearch 
{
	public static int linearSearch(int arr[],int key)
	{
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				index=i;
				return arr[index];
			}
		}
		return index;
		
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {4,8,6,8,55,44,3,55,13,65};
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ELEMNT FOR SEARCH");
		int key=sc.nextInt();
		int a=linearSearch(arr, key);
		if(a==key)
		{
			System.out.println("ELEMENT IS PRESENT IN ARRY");

		}
		else
			System.out.println("ELEMENT IS NOT IN ARRY");

	}

}
