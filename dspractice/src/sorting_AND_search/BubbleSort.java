package sorting_AND_search;

import java.util.Scanner;

public class BubbleSort 
{
	int []arr;
	int size;
	BubbleSort(int size)
	{
		this.arr=new int[size];
		this.size=size;
	}
	
	public void bubblesort()
	{
		int temp;
		int count=-1;
		int pass=0;
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					++count;
					//display();
					//ystem.out.println("");
				}
			}
			
			display();
			System.out.println("");
			System.out.println("");
		}
		System.out.println("TOTAL SWAPPING IS "+count+" TIMES");
	//	System.out.println("PASSES ARE "+pass+" TIMES");
	}
	
	public void acceptElement()
	{
		System.out.println("ENTER THE ARRAY ELEMENT");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i] =sc.nextInt();
			
		}
	}
	
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
			
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("ENTER THE SIZE OF AN ARRY");
		size=sc.nextInt();
		BubbleSort b1=new BubbleSort(size);
		b1.acceptElement();
		System.out.println("before");
		b1.display();
		System.out.println("");
		
		System.out.println("PASSES");
		b1.bubblesort();
		System.out.println(" AFTER BUBBLE SORT ");
		b1.display();
		
		
	}

}
