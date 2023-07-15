package sorting_AND_search;

import java.util.Scanner;

public class SelectioSort 
{
	int size;
	int arr[];
	public SelectioSort(int size)
	{
		this.arr=new int[size];
		this.size=size;
	}
	public void acceptArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRY ELEMENTS");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
		}
	}
	public void sort()
	    {
	  
	 
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i <arr.length-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int min_idx = i;
	            for (int j = i+1; j < arr.length; j++)
	                {
	            		if (arr[j] < arr[min_idx])
	                    min_idx = j;
	                }
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[min_idx];
	            arr[min_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	/*public void selectionSort()
	{
		int index;
		int min;
		for(int i=0;i<size;i++)
		{
			 min=arr[i];
			 index=i;
			 for(int j=0;j<size;j++)
			 {
				 if(arr[j]<min)
				 {
					 int temp=min;
					 min=arr[j];
					 arr[j]=temp;
				 }
			 }
			
			
		}
		
	}*/
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
	}

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRY");
		int size=sc.nextInt();
		SelectioSort s1=new SelectioSort(size);
		s1.acceptArray();
		System.out.println("");
		System.out.println("BEFORE SORTING");
		s1.display();
		s1.sort();
		System.out.println("");
		System.out.println("AFTER SELECTION SORT");
		s1.display();
	}

}
