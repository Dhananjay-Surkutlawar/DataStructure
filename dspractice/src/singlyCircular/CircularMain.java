package singlyCircular;

import java.util.Scanner;

public class CircularMain 
{
	public static void main(String[] args) {
		SinglyCircular list=new SinglyCircular();
		int choice=-1;
		Scanner sc=new Scanner(System.in);

		do{
			System.out.println("");
			System.out.println("**************************");
			System.out.println("1.ADD ELEMENT IS LL");
			System.out.println("2.DIsplay LL");
		/*	System.out.println("3.DELETE FRONT NODE");
			System.out.println("4.DELETE AT END NODE");
			System.out.println("5:ADD AT FRONT");
			System.out.println("6.ADD AT END");
			System.out.println("7.PRINT REVERSE ");
			System.out.println("8.TO REVERSE LIST");
			System.out.println("0.EXIT");*/
			System.out.println("**************************");
			System.out.println("ENTER THE CHOICE");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ELEMENT TO ADD IN LIST");
				int n=sc.nextInt();
				list.createLL(n);
				break;
			case 2:
				System.out.println("ELEMENTS ARE");
				list.display();
				break;
		/*	case 3:
				a.deleteAtFront();
				break;
			case 4:
				a.deleteAtEnd();
				break;
			case 5:
				System.out.println("ELEMENT TO ADD IN LIST");
				n=sc.nextInt();
				a.addAtFront(n);
				break;
			case 6:
				System.out.println("ELEMENT TO ADD IN LIST");
				n=sc.nextInt();
				a.addAtEnd(n);
				break;
			case 7:
				a.printReverse(a.head);
				break;
			case 8:
				a.reverseList();
				break;*/
			case 0 :
				break;
			default:
				break;

			}




		}while(choice!=0);
	}

}
