package assignmentno1;



public class Book 
{
	
	
	private int bookid;
	private String name;
	private int price;
	
	public Book()
	{
		
	}

	public Book(int bookid, String name, int price) {
		super();
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

	
	public static void displayAll(Book arr[],int count)
	{
		for(int i=0;i<=count;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
	
	


}
