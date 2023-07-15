package Queue;

public class NodeE 
{
	Emp data;
	NodeE next;
	
	NodeE(Emp e)
	{
		this.data=new Emp(e.getId(),e.getName(),e.getSal());
		this.next=null;
		
	}

}
