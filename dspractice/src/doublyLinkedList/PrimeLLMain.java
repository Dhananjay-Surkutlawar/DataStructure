package doublyLinkedList;

import java.util.Scanner;

public class PrimeLLMain 
{
	public static void main(String[] args)
	{
		int terms;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER HOW MANY PRIME NO YOU WANT");
		terms=sc.nextInt();
		PrimeLL p=new PrimeLL();
		p.createLL(terms);
		p.display();
	}

}
