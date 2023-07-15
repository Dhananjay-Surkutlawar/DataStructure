package dynamicStackLL;

import java.util.Scanner;

public class OddEvenMain {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		StackOddEven list1=new StackOddEven();
		Scanner sc=new Scanner(System.in);
		StackOddEven list2=new StackOddEven();
		System.out.println("Enter the terms for even  no");
		int n=sc.nextInt();
		list1.pushEven(n);
		System.out.println("Enter the terms for odd no");
		n=sc.nextInt();
		list2.pushOdd(n);
		list1.display();
		System.out.println("");
		list2.display();
	}

}
