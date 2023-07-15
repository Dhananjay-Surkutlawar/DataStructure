package assignmentno1;

import java.util.Scanner;

public class Bookmain 
{


	public static void main(String[] args) 
	{
		int count=0;
		String name;
		int bookid;
		int price;
		int a = 0;

		Scanner sc= new Scanner(System.in);
		System.out.println("ENTER THE LENGTH OF AN ARRAY");
		int length=sc.nextInt();
		Book[]bookArry=new Book[length]; // making object reference array
		int choice;


		do
		{
			System.out.println("1.ADD RECORD");
			System.out.println("2.ALL DISPLAY");
			System.out.println("3.MODIFY");
			System.out.println("4.SEARCH");
			System.out.println("5.COUNT");
			System.out.println("*****ENTER YOUR CHOICE*****");
			choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("ENTER THE BOOK ID");
				bookid=sc.nextInt();
				System.out.println("ENTER THE BOOK NAME");
				name=sc.next();
				System.out.println("ENTER THE BOOK PRICE");
				price=sc.nextInt();
				bookArry[count]= new Book(bookid,name,price);
				count++;
				break;

			case 2:
				Book.displayAll(bookArry,count);
				break;

			case 3: 
				System.out.println("ENTER THE BOOK ID");
				bookid=sc.nextInt();
				System.out.println("ENTER THE BOOK NAME");
				name=sc.next();
				System.out.println("ENTER THE BOOK PRICE");
				price=sc.nextInt();
				for(int i=0;i<count;i++)
				{
					if(bookArry[i]!=null && bookArry[i].getBookid()== bookid)
					{
						bookArry[i].setName(name);
						bookArry[i].setPrice(price);
					}
				}

				break;

			case 4:

				System.out.println("ENTER CHOICE");

				System.out.println("1.SEARCH BY ID ");
				System.out.println("2.SEARCH BY NAME");
				System.out.println("3.SEARCH BY PRICE");
				a=sc.nextInt();
					switch(a)
					{
						case 1:
							System.out.println("ENTER THE ID OF A BOOK");
							bookid=sc.nextInt();
							for(int i =0;i<=count;i++)
							{
								if(bookArry[i]!=null && bookArry[i].getBookid()==bookid)
								{
									System.out.println(bookArry[i].toString());
								}
							}
							break;
					
					
						case 2:
							System.out.println("ENTER THE NAME OF BOOK");
							name=sc.nextLine();
							for(int i=0;i<=count;i++)
							{
								if(bookArry[i]!=null && bookArry[i].getName() == name)
								{
									System.out.println(bookArry[i].toString());
								}
							}
							break ;
					
					
						case 3:
							System.out.println("ENTER THE PRICE OF BOOK");
							price=sc.nextInt();
							for(int i =0;i<=count;i++)
							{
								if(bookArry[i]!=null && bookArry[i].getPrice()==price)
								{
									System.out.println(bookArry[i].toString());
								}
							}
							break;
						
						default:
							System.out.println("WRONG INPUT");
					

				}

				break;

			case 5:
				System.out.println("COUNT OF THE ELEMENT OF ARRAY IS"+count);
				break;
				
			default:
				System.out.println("WRONG INPUT");

			}

		}while(choice!=0);

	}

}
