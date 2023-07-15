package Queue;

import java.util.Scanner;

public class EmpMain 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		EmpQueue Q=new EmpQueue();
		Emp e=null;
		Scanner sc=new Scanner(System.in);
		int choice=-1;
		do{
			System.out.println("0.EXIT");
			System.out.println("1.ADD EMPLOYEE");
			System.out.println("2.DELETE EMPLOYEE");
			System.out.println("3.DISPLAY");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("ENTER THE ID");
				int id=sc.nextInt();
				System.out.println("ENTER THE NAME");
				String name=sc.next();
				System.out.println("ENTER SALARY");
				int sal=sc.nextInt();
				e=new Emp(id,name,sal);
				Q.enQueue(e);
				break;

			case 2:
				Q.deQueue();
				break;

			case 3:
				Q.display();
				break;

			case 0:
				break;

			default :
				break;


			}
		}while(choice!=0);



	}

}
