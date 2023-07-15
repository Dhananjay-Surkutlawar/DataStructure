package doublyLinkedList;

import java.util.Scanner;

public class OperationMain 
{
	public static void main(String[] args)
	{
		int choice=-1;
		int n=0;
		int pos=0;
		OperationDoublyLL list1= new OperationDoublyLL();
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("");
			System.out.println("******************************************");
			System.out.println("1.add element");
			System.out.println("2.add element at specific position");
			System.out.println("3.display");
			System.out.println("4.display reverse");
			System.out.println("5.delete data");
			System.out.println("6.search");
			System.out.println("7.Delete at end");
			System.out.println("8.DELETE AT POSTION");
			System.out.println("******************************************");
			System.out.println("Enter the choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the element to add");
				n=sc.nextInt();
				list1.addData(n);
				break;
			case 2:
				System.out.println("Enter the element to add");
				n=sc.nextInt();
				System.out.println("Enter the position");
				pos=sc.nextInt();
				list1.addDataAtPosition(n, pos);
				break;
			case 3:
				list1.display();
				break;
			case 4:
				list1.reverseDisplay();
				break;
			case 5:
				System.out.println("Enter the element to delete");
				n=sc.nextInt();
				list1.deleteData(n);
				break;
			case 6:
				System.out.println("Enter the element to search");
				n=sc.nextInt();
				list1.search(n);
				break;
			case 7:
				list1.deleteAtEnd();
				break;
			case 8:
				System.out.println("Enter the postion to delete");
				n=sc.nextInt();
				list1.deleteAtPostion(n);
				
				break;
			case 0:
				System.out.println("TERMINATED");
				break;
			default:
				break;
				
			
			}
			
			
			}while(choice!=0);
		
	}

}
