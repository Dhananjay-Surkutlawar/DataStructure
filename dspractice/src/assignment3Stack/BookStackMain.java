package assignment3Stack;

import java.util.Scanner;

public class BookStackMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF STACK");
		int size=sc.nextInt();
		BookStack b1= null;
		BookStack2 b2= new BookStack2(size);
		int id=0;
		String name="";
		int choice=-1;
		do {
			System.out.println("0.EXIT");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.display");
			System.out.println("*****ENTER CHOICE*****");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER THE OF BOOK");
				id=sc.nextInt();
				System.out.println("ENTER THE NAME OF BOOK");
				name=sc.next();
				b1=new BookStack(id,name);
				b2.push(b1);
				break;


			case 2:
				b1=b2.pop();
				if(b1==null)
				{
					System.out.println("VALUE IS NULL");
				}
				else
					System.out.println(b1.toString());
				break;


			case 3:
				b2.display();
				break;

			case 0:
				break;
			
			default:
				System.out.println("INVALID CHOICE");

			}


		}while(choice!=0);



	}

}
