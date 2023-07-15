package dynamicStackBook;

import java.util.Scanner;
class Book
{
	private int bookid;
	private String name;
	private int price;
	
	public Book()
	{
		
	}

	public Book(int bookid, String name, int price) {

		this.bookid = bookid;
		this.name = name;
		this.price = price;
	}
	
	
	
	
	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", name=" + name + ", price=" + price + "]";
	}


}
class BookNode 
{
	Book data; // book object
	BookNode next; 
	
	public BookNode(Book b) 
	{
		
		this.data = new Book(b.getBookid(),b.getName(),b.getPrice());
		this.next=null;
	
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
class StackLL 
{
	BookNode top;

	public StackLL() 
	{
		// TODO Auto-generated constructor stub
		top=null;
	}

	public void push(Book n)
	{
		
		BookNode record=new BookNode(n);
		if(top == null)
			top= record;
		else if(!isEmpty())
		{
			{
				record.setNext(top);;
				top=record;
			}
		}

		}

		public void display()
		{
			BookNode move=top;
			while(move!=null)
			{
				System.out.print(" "+move.data);
				move=move.next;
				System.out.println("");

			}
		}
		public void pop()
		{	if(!isEmpty())
		{
			System.out.println("DELETED ELEMENT IS "+top.data);
			top=top.next;
		}
		else
			System.out.println("Stack is empty");
		}
		public boolean isEmpty()
		{
			if( top == null)
				return true;
			else
				return false;
		}
	}


public class Bookmain {

	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		Book b1=null;
		StackLL s=new StackLL();
		Scanner sc = new Scanner(System.in);
		int choice=-1;
		do{
			System.out.println("0.EXIT");
			System.out.println("1.ADD BOOK");
			System.out.println("2.DELETE BOOK");
			System.out.println("3.DISPLY");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER THE BOOK ID");
				int id=sc.nextInt();
				System.out.println("ENTER THE BOOK NAME");
				String name=sc.next();
				System.out.println("ENTER THE PRICE OF BOOK");
				int price=sc.nextInt();
				b1=new Book(id,name,price);
				s.push(b1);
				break;
			case 2:
				s.pop();
				break;
			case 3:
				s.display();
				break;
			case 0:
				break;
			default :
					break;
			}
			
		}while(choice!=0);

	}

}
