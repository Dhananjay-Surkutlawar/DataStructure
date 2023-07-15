package Queue;

public class EmpQueue 
{
	NodeE rear,front;

	EmpQueue()
	{
		rear=front=null;
	}

	public void enQueue(Emp data)
	{


		NodeE record=new NodeE(data);
		if(rear==null)
			front=rear=record;
		else
		{
			rear.next=record;
			rear=record;
		}



	}
	public void deQueue() 
	{
		if(front==null)
			System.out.println("Queue is empty");
		else
		{
			System.out.println(front.data);
			front=front.next;
		}

	}
	public void display()
	{
		if(front==null)
			System.out.println("queue is empty!!!");
		else
		{
			NodeE move=front;
			while(move!=null)
			{
				System.out.println(move.data);
				move=move.next;

			}
		}

	}


}
