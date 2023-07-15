package dynamicStackLL;

public class DynamicStack 
{
	Node top;
	
	public DynamicStack() 
	{
		// TODO Auto-generated constructor stub
		top=null;
	}
	
	public void creatStack(int n)
	{
		Node record=new Node(n);
		if(top == null)
			top= record;
		else
		{
			record.setNext(top);;
			top=record;
		}
		
	}
	public void display()
	{
		Node move=top;
		while(move!=null)
		{
			System.out.print(" "+move.data);
			move=move.next;
			
		}
	}
	public void delete()
	{
		System.out.println("DELETED ELEMENT IS "+top.data);
		top=top.next;
	}

}
