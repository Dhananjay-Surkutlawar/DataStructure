package Queue;

public class Queue 
{
	Node rear,front;

	public Queue() 
	{
		rear=front=null;
	}

	void enQueue(int data)
	{
		Node record=new Node(data);
		if(rear==null)
			front=rear=record;
		else
		{
			rear.next=record;
			rear=record;
		}
	}
	
	public int deQueue()
	{
		if(front==null)
		{
			return -99999;
		}
		else
		{
			Node del=front;
			front=front.next;
			return del.data;
		}
	}
	
	public void display()
	{
		Node move=front;
		while(move!=null)
		{
			System.out.println(move.data);
			move=move.next;
		}
	}
}
