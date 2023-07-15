package Linked_List;

import java.util.Scanner;

public class MainLL 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList list1=new LinkedList();
		System.out.println("ENTER THE TERMS ");
		Scanner sc = new Scanner(System.in);
		int terms=sc.nextInt();
		list1.createLL(terms);
		list1.display();
	}

}
