package dynamicStackLL;

public class StackOddEven 
{
	Node top;

	StackOddEven()
	{
		top=null;

	}
	public void pushOdd(int terms)
	{
		int n=1;
		int count=1;
		while(count<=terms)
		{
			Node record=new Node(n);
			if(top == null)
			{
				top= record;
				count++;
				
			}
				
			else
			{
				record.setNext(top);;
				top=record;
				count++;
			}
			n=n+2;
		}

	}

	public void pushEven(int terms )
	{
		int count=1;
		int n=2;
		while(count<=terms)
		{
			Node record=new Node(n);
			if(top == null)
			{	top= record;
				count++;
			}
			else
			{
				record.setNext(top);;
				top=record;
				count++;
			}
			n=n+2;
		}

	}
	public boolean isEmpty()
	{
		if( top == null)
			return true;
		else
			return false;
	}

	public void display()
	{
		if(!isEmpty())
		{
			Node move=top;
			while(move!=null)
			{
				System.out.print(" "+move.data);
				move=move.next;

			}
		}

	}
	public void pop()
	{
		if(!isEmpty())
		{
			System.out.println("DELETED ELEMENT IS "+top.data);
			top=top.next;
		}

	}

}
