package Queue;

import java.util.Scanner;

public class QueueMain 
{
	public static void main(String[] args)
	{
		Queue q=new Queue();
		Scanner sc=new Scanner(System.in);
		int choice=-1;
		do
		{
			System.out.println("0.EXIT");
			System.out.println("1.ADD ELEMENT");
			System.out.println("2.REMOVE ELEMENT");
			System.out.println("3.DISPLAY ");
			System.out.println("*****ENTER YOUR CHOICE*****");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:System.out.println("ENTER ELEMENT");
			int n=sc.nextInt();
				q.enQueue(n);
				break;
			
			case 2:
				q.deQueue();
				break;
			case 3:
				q.display();
				break;
			case 0:
				break;
			
			default:
				break;
				
			}
			
		}while(choice!=0);
		
	}

}
