package assignment3Stack;

public class BracketsStack 
{
	char []arr;
	int size;
	int top;
	public BracketsStack(int size) 
	{
		// TODO Auto-generated constructor stub
		this.arr=new char[size];
		this.size=size;
		this.top=-1;

	}
	public void push(char n)
	{
		if(!isFull())
			arr[++top]=n;
		else 
			System.out.println("STACK IS FULL!!!");


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
	public char pop()
	{
		char n = '*';
		if(!isEmpty())
			n=arr[top--];
		return n;


	}


}
