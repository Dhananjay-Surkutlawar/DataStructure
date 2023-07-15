package Linked_List;

public class IntLL 
{
	Node head;
	
	public void createLL(int no) 
	{
		
		Node record=new Node(no);
			if(head==null)
			{
				head=record;
			}
			else
			{
				Node move=head;
				while(move.next!=null)
				move=move.next;
				move.next=record;
			}
		
	}
	public void display()
	{
		Node move=head;
		while(move!=null)
		{
			System.out.println(" "+move.data+"---");
			move=move.next;
		}
	}
	public void deleteAtFront()
	{
		if(head==null)
		{
			System.out.println("LINKED LIST IS EMPTY");
		}
		else
		System.out.println("DELETED ELEMENT IS"+head.data);
		head=head.next;
	}
	public void deleteAtEnd() 
	{
		Node move=head;
		//Node temp=move;
		while(move.next.next!=null)
		{
			move=move.next;
		}
		System.out.println("DELETED ELEMENT IS"+move.next.data);
		//move=temp;
		move.next=null;
		
	}
	public void addAtFront(int n)
	{
		Node record=new Node(n);
		Node move=head;
		record.next=head;
		head=record;
		
		
	}
	public void addAtEnd(int n)
	{
		Node record=new Node(n);
		if(head==null)
		{
			head=record;
		}
		else
		{
			Node move=head;
			while(move.next!=null)
			move=move.next;
			move.next=record;
		}
		
	}
	public void printReverse(Node move) 
	{
		if(move!=null) 
		{
			printReverse(move.next);
			System.out.print(" "+move.data);
		}
		
	}
	public void reverseList()
	{
		Node prev=head;
		Node curr=prev.next;
		Node nxt=curr.next;
		while(curr!=null)
		{
			curr.next=prev;
			prev=curr;
			curr=nxt;
			if(nxt!=null)
				nxt=nxt.next;
		}
		head.next=null;
		head=prev;
	}
}
