package singlyCircular;

public class SinglyCircular 
{
	Node head;
	
	public SinglyCircular()
	{
		this.head=null;
	}
	public void createLL(int n)
	{
		Node record=new Node(n);
		if(head==null)
		{
			head=record;
			head.next=record;
		}
		else
		{
			Node move=head;
			
			while(move.next!=head)
				move=move.next;
			
			move.next=record;
			record.next=head;
			
		}
		
	}
	public void display()
	{
		Node move =head;
		while(move.next!=head)
		{
			System.out.print(move.data+" ");
			move=move.next;
			
		}
		
	}

}
