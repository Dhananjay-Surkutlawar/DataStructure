package dynamicStackLL;

import java.util.Scanner;



public class DyStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		DynamicStack d1=new DynamicStack();
		int choice=-1;
		do{
			System.out.println("");
			System.out.println("**************************");
			System.out.println("1.ADD ELEMENT IS LL");
			System.out.println("2.DIsplay LL");
			System.out.println("3.DELETE element");
			System.out.println("0.EXIT");
			System.out.println("**************************");
			System.out.println("ENTER THE CHOICE");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ELEMENT TO ADD IN LIST");
				int n=sc.nextInt();
				d1.creatStack(n);
				break;
			case 2:
				System.out.println("ELEMENTS ARE");
				d1.display();
				break;
			case 3:
				d1.delete();
				break;

			case 0 :
				break;
			default:
				break;

			}


		}while(choice!=0);
	}

}
