package assignmentno2;

import java.util.Scanner;

public class MyArry 
{
	int []arr;
	int s;
	public MyArry(int size) 
	{
		super();
		this.arr = new int[size];
		this.s=size;
	}
	Scanner sc= new Scanner(System.in);
	public void accept()
	{
		System.out.println("ENTER THE ARRY ELEMENT");
		for(int i=0;i<s;i++)
		{
			this.arr[i]=sc.nextInt();
		}
	}
	
	public void display()
	{
		for(int i=0;i<s;i++)
		{
			System.out.println(this.arr[i]+" ");
		}
	}
	
	public boolean search(int key)
	{
		boolean flag=false;
		for(int i=0;i<s;i++)
		{
			if(key == this.arr[i])
			{
				flag=true;
			}
		}
		return flag;
	}
	
	public int positionFind(int key)
	{ int val=-1;
		for(int i=0;i<s;i++)
		{
			if(this.arr[i]== key)
				val=i;
		}
		
		return  val;
	}
	
	public void reverse()
	{
		int temp,i=-1,j=-1;
		for(i=0,i=arr.length-1;i<j;i++,j--)
		{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	

}
