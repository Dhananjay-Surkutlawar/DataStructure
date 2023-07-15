package assignmentQueue;

import java.util.Scanner;

public class QueueCustomerMain 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size;
		String name="";
		System.out.println("ENTER THE SIZE OF QUEUE");
		size=sc.nextInt();
		QueueCustomer c2=null;
		
		CustomerArry  c1=new CustomerArry(size);
		int choice=-1;
		do
		{
			System.out.println("0.EXIT");
			System.out.println("1.ADD CUSTOMER");
			System.out.println("2.SERVE CUSTOMER");
			System.out.println("3.DISPLAY CUSTOMERS");
			System.out.println("*****ENTER YOUR CHOICE*****");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER THE NAME OF CUSTOMER");
				name=sc.next();
				c2=new QueueCustomer(name);
				c1.enQueue(c2);
				break;
			
			case 2:
				c1.deQueue();
				break;
			case 3:
				c1.display();
				break;
			case 0:
				break;
			
			default:
				break;
				
			}
			
		}while(choice!=0);
		
		
		
	}

}
