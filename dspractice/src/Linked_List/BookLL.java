package Linked_List;

public class BookLL 
{
	BookNode head;
	
	public BookLL() 
	{
		this.head=null;
	}
	
	public void createLL(Book b) 
	{
		BookNode record=new BookNode(b);
		if(head==null)
		{
			head=record;
			
		}
		else
		{
				BookNode move=head;
				
				while(move.next!=null)
				move=move.next;
				move.next=record;
		}
		
	
		
	}
	
	public void display()
	{
		BookNode move=head;
		while(move!=null)
		{
			System.out.println(" "+move.data);
			move=move.next;
			
		}
		
	}
}
