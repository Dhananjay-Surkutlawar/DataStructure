package doublyLinkedList;

public class PrimeLL 
{
	Node head;

	PrimeLL()
	{
		this.head=null;

	}
	
	public void  createLL(int terms)
	{
		int n=2;
		int count=0;
		boolean flag;
		while(count<=terms)
		{
			Node record;
			flag=true;
			
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
				{
					flag=false;
					break;
				}
				

			}
			if(flag)
			{
				count++;
					record= new Node(n);

					if(head==null)
						head=record;

					else
					{
						Node move=head;

						while(move.next!=null)
							move=move.next;

						move.next=record;
						record.prev=move;
						count++;

					}
					

				
			}
			n++;
		}


	}
	public void display() 
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(move.data+"---> ");
			move=move.next;
		}
	}

}
