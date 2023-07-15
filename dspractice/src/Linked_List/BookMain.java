package Linked_List;

import java.util.Scanner;

public class BookMain 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Book b=null;
		BookLL n= new BookLL();;
		
		int choice=-1;
		do{
			System.out.println("0.EXIT");
			System.out.println("1.ADD BOOK");
			System.out.println("2.DISPLY");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER THE BOOK ID");
				int id=sc.nextInt();
				System.out.println("ENTER THE BOOK NAME");
				String name=sc.next();
				System.out.println("ENTER THE PRICE OF BOOK");
				int price=sc.nextInt();
				b=new Book(id,name,price);
				//n= new BookLL();
				
				n.createLL(b);
				break;
			case 2:
				n.display();
				break;
			case 0:
				break;
			default :
					break;
			}
			
		}while(choice!=0);
		
		

	}

}
