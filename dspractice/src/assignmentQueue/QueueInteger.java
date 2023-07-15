package assignmentQueue;

public class QueueInteger 
{
	int []arr;
	int rear;
	int front;
	int size;

	public QueueInteger(int size)
	{
		this.rear=-1;
		this.front=0;
		this.arr=new int[size];
		this.size=size;

	}

	public boolean isFull() 
	{
		if( rear==size-1)
			return true;
		else
			return false;
	}
	public boolean isEmpty()
	{
		if(rear==-1&&front==-1)
		{
			return true;

		}
		else
			return false;
	}

	public void enQueue(int a)
	{
		if(!isFull())
		{
			arr[++rear]=a;
		}
		else
			System.out.println("QUEUE IS FULL");
	}

	public void deQueue() 
	{

		if(!isEmpty())
		{

			System.out.println("REMOVED ELEMENT IS"+arr[front++]);
		}
		else
			System.out.println("QUEUE IS EMPTY");
	}
	public void display()
	{
		for(int i=front;i<size;i++)
		{
			System.out.println("*****QUEUE IS *****");
			System.out.print(arr[i]+" ");
		}

	}


}
