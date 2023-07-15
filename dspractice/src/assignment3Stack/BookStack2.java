package assignment3Stack;

public class BookStack2 
{
	int size;
	BookStack []arr;
	int top=-1;
	int count;

	public BookStack2(int size)
	{
		this.size=size;
		this.arr=new BookStack[size];
		this.top=-1;
	}


	public void push(BookStack n)
	{
		if(!isFull())
			arr[++top]=n;
		else 
			System.out.println("STACK IS FULL!!!");


	}

	public BookStack pop()
	{
		BookStack n=null;
		if(!isEmpty())
			n=arr[top--];
		return n;


	}

	public boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;

	}
	public boolean isFull()
	{
		if(top==size-1)
			return true;
		else 
			return false;

	}

	public void display() 
	{
		int count=top;
		System.out.println("*****STACK ELEMENTS ARE*****");

		for(int i=count;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}



}
