package assignmentno1;

public class AmstrongNumber 
{
	public static boolean checkArmstrong(int a)
	{
		int  count=0;
		int  temp=a;
		int  sum=0;
		int  last=0;
		while(temp!=0)
		{
			temp=temp/10;
			count++;
		}
		temp=a;
		
		while(temp!=0)
		{
		 last=temp%10;
		 sum=sum+(int)(Math.pow(last,count));
		 temp=temp/10;
		}
		
		if(a==sum)
		return true;
		
		else 
		return false;
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*****Armstrong from 1 to 1000*****");
		for(int i=1;i<1000;i++)
		{
			if(checkArmstrong(i))
			{
				System.out.println(i);
			}
				
		}
		
	}

}
