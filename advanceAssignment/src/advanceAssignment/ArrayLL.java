package advanceAssignment;

public class ArrayLL 
{
	Node []head;
	int size;


	public ArrayLL (int size)
	{
		this.head=new Node[size];
		this.size=size;


		for(int i=0;i<size;i++)
		{
			head[i]=new Node(i);

		}
	}
	
	public void add(int LL,int data)
	{
		Node move=head[LL];
		Node record= new Node(data);
		while(move.next!=null)
			move=move.next;
		move.next=record;
	}
	
	public void display()
	{
		for(int i=0;i<size;i++)
		{
			Node move=head[i];
			while(move!=null)
			{
				System.out.print(move.data+" ");
				move=move.next;
			}
			System.out.println("");
		}
		

	}

}
