package tree;

import java.util.Scanner;



public class MainTree {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeNormal t=new TreeNormal();
		
		Scanner sc= new Scanner(System.in);
		int choice=-1;
		int n;
		do {
			System.out.println("0.exit");
			System.out.println("1.add node");
			System.out.println("2.display");
			System.out.println("3.display highest");
			System.out.println("4.display smallest");
			System.out.println("ENTER THE CHOICE");
			choice =sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter the data");
				n=sc.nextInt();
				t.AddNode(n);;
				break;
			case 2:
				t.display();
				break;
			case 3:
				//t.highest();
				break;
			case 4:
				//t.smallest();
				break;
			case 0:
				break;
			default:
				System.out.println("WRONG CHOICE");
				break;

			}
		}while(choice!=0);
		

	}

}
