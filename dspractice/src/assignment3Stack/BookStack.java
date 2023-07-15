package assignment3Stack;

public class BookStack 
{
	int bookid;
	String name;

	public BookStack() {
		// TODO Auto-generated constructor stub
	}

	public BookStack(int bookid, String name)
	{
		super();
		this.bookid = bookid;
		this.name = name;

	}

	@Override
	public String toString() 
	{
		return "BookStack [bookid=" + bookid + ", name=" + name + "]";
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








}
