package assignmentQueue;

import java.util.Scanner;

public class QueueIntegerMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF QUEUE");
		int size=sc.nextInt();
		QueueInteger q1=new QueueInteger(size);
		int choice=-1;
		int n;
		do
		{	System.out.println("ENTER THE CHOICE");
		System.out.println("***************************");
		System.out.println("0.EXIT");
		System.out.println("1.ADD IN QUEUE");
		System.out.println("2.REMOVE FROM QUEUE");
		System.out.println("3.DISPLAY QUEUE");
		System.out.println("***************************");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("ENTER THE ELEMENT TO ADD");
			n=sc.nextInt();
			q1.enQueue(n);
			break;
		case 2:
			q1.deQueue();
			break;
		case 3:
			q1.display();
		case 0:
			break;
		default:
			System.out.println("INVALID CHOICE");
			break;

		}
		}while(choice!=0);


	}

}
