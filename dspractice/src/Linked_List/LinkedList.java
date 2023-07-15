package Linked_List;

public class LinkedList 
{
	Node head;
	public LinkedList()
	{
		head=null;
		
	}
	
	public void createLL(int terms) 
	{
		int no=2;
		for(int i=1;i<=terms;i++)
		{
			Node record=new Node(no);
			if(head==null)
			{
				head=record;
			}
			else
			{
				Node move=head;
				while(move!=null)
				move=move.next;
				move.next=record;
			}
			no=no+2;
			
		}
	}
	public void display()
	{
		Node move=head;
		while(move.next!=null)
		{
			System.out.println(" "+move.data);
			move=move.next;
		}
	}
}
