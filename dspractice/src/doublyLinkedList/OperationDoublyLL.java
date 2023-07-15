package doublyLinkedList;

public class OperationDoublyLL 
{
	Node head;
	public OperationDoublyLL() 
	{
	
		// TODO Auto-generated constructor stub
		head=null;
		
	}
	public void addDataAtPosition(int a,int pos)
	{
		Node record =new Node(a);
		if(head==null)
			head=record;
		else
		{
			Node move = head;
			for(int i=1;i<pos-1;i++)
				move=move.next;
			
			record.next=move.next;
			record.prev=move;
			move.next.prev=record;
			
			move.next=record;
		}
		
			
	}
	public void deleteAtPostion(int pos)
	{
		Node move = head;
		
		if(count()==pos)
		{
			while(move.next!=null)
				move=move.next;
			
			move.prev.next=null;
		}
		else 
		{
			for(int i=1;i<pos-1;i++)
				move=move.next;
		
			move.next=move.next.next;
			move.next.prev=move;
		}
		
		
		
	}
	public int count()
	{
		int count=0;
		Node move = head;
		while(move.next!=null)
		{
			move=move.next;
			count++;
		}
		
		return count;
	}
	
	public void deleteAtEnd() 
	{
		Node move=head;
		while(move.next.next!=null)
			move=move.next;
		move.next=null;
	}
	public void addData(int n)
	{
		Node record=new Node(n);
		if(head==null)
			head=record;
		else
		{
			Node move=head;
			while(move.next!=null)
				move=move.next;
			move.next=record;
			record.prev=move;
		}
		
	}
	public void display() 
	{
		Node move=head;
		while(move!=null)
		{
			System.out.print(move.data+" ");
			move=move.next;
		}
	}
	public void reverseDisplay() 
	{
		Node move;
		for(move=head;move.next!=null;move=move.next);
		while(move!=null)
		{
			System.out.print(move.data+" ");
			move=move.prev;
		}
	}
	public void deleteData(int n)
	{
		if(search(n))
		{
			Node move=head;
			Node temp=head;
			while(move!=null)
			{
				
				if(move.data==n)
				{
					temp.next=move.next;
					move.next.prev=temp;
					break;
				}
				else {
					temp=move;
					move=move.next;
				}
					
					
				
				
			}
		}
		
	}
	public boolean search(int n)
	{
		Node move=head;
		while(move!=null)
		{
			if(move.data==n)
				{
				System.out.println("FOUNDED");
				
				return true;
				}
			else
				move=move.next;
		}
		
		return false;
	}
	
}
