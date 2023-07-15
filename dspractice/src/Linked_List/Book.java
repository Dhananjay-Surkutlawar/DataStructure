package Linked_List;

public class Book 
{
	int id;
	String name;
	int price;
	public Book(int id, String name, int sal) 
	{
		super();
		this.id = id;
		this.name = name;
		this.price = sal;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricel() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
