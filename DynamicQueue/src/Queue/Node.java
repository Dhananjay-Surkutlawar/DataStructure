package Queue;

public class Node 
{
	 
	 	int data;
	 	Node next;
	 	public Node() 
	 	
	 	{
	 		this.data=0;
	 		this.next=null;
	 		
	 	}
	 	public Node(int data)
	 	{
	 		this.data=data;
	 		this.next=null;
	 		
	 	}
	 	@Override
	 	public String toString() {
	 		return "Node [data=" + data + "]";
	 	}


}
