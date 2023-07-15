package assignmentno2;

import java.util.Scanner;

public class MyArryMain {

	public static void main(String[] args) 
	{
		int n;
		int choice=-1;
		MyArry a=null;
		Scanner sc= new Scanner(System.in);
		do {
			System.out.println("ENTER THE CHOICE");
			System.out.println("0.FOR EXIT ");
			System.out.println("1.IMPLEMENT APPROPRIATE CONSTRUCTOR");
			System.out.println("2.ACCEPT THE ARRY");
			System.out.println("3.DISPLAY ARRY");
			System.out.println("4. CHECK ELEMENT IS PRESENT OR NOT");
			System.out.println("5.FIND THE POSITION IN ARRY");
			System.out.println("6.REVERSE  THE ARRY");
			choice=sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("ENTER THE SIZE OF AN ARRY");
					n=sc.nextInt();
					a= new MyArry(n-1);
					break;
				
				case 2:
					a.accept();
					break;
					
				case 3:
					a.display();
					break;
					
				case 4:
					System.out.println("ENTER THE ELEMENT FOR SEARCH");
					n=sc.nextInt();
					System.out.println(a.search(n));
					break;
					
				case 5:
					System.out.println("ENTER THE ELEMENT TO GET ITS INDEX VALUE");
					n=sc.nextInt();
					System.out.println(a.positionFind(n));
					break;	
					
				case 6:
					a.reverse();
					break;
					
				default :
					System.out.println("INPUT IS NOT VALID");
				}
		}while(choice!=0);
		
		
	}
}
