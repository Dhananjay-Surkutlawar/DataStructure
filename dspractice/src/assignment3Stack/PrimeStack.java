package assignment3Stack;

public class PrimeStack 
{
	int []arr;
	int size;
	int top;
	int count;
	
	public PrimeStack(int size) 
	{
		super();
		this.arr = new int[size];
		this.size = size;
		this.top = -1;
	}
	
	public void push(int n)
	{
		if(!isFull())
		arr[++top]=n;
		else 
			System.out.println("STACK IS FULL!!!");
		
		
	}
	
	public void pop()
	{
		if(!isEmpty())
		{System.out.println("DELETED ELEMENT IS "+arr[top]);
		top--;
		
		}
		else 
			System.out.println("STACK IS EMPTY!!!");
		
		
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
		count=top;
		for(int i=top;i>=0;i--)
		{
			System.out.println(arr[count--]);
		}
		
		
		
	}
	
	
	public  boolean checkPrime(int a)
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				return false;
			
			}
		}
		return true;
	
	}
	
	
	
	
	


}
