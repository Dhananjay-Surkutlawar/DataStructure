package assignmentQueue;

public class CustomerArry 
{
	int size;
	int front;
	int rear;
	QueueCustomer[]arr;
	
	public CustomerArry(int size) 
	{
		// TODO Auto-generated constructor stub
		this.arr=new QueueCustomer[size];
		this.size=size;
		this.rear=-1;
		this.front=0;
		
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

	public void enQueue(QueueCustomer a)
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
		System.out.println("\n");

	}

	

}
