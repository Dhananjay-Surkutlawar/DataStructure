package Linked_List;

public class BookNode 
{
	Book data; // book object
	BookNode next; 
	
	public BookNode(Book b) 
	{
		
		this.data = new Book(b.id,b.name,b.price);
	
	}
	public Book getData()
	{
		return data;
	}
	public void setData(Book data)
	{
		this.data = data;
	}
	public BookNode getNext() 
	{
		return next;
	}
	public void setNext(BookNode next)
	{
		this.next = next;
	}
	
	

}
