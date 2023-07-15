package assignment3Stack;

//import java.util.Scanner;

public class PrimeStackMain 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int size;
		int n=1;
		
		size=10;
		PrimeStack p1=new PrimeStack(size);
		while(n<=10)
		{
			for(int j=2;j<=30;j++)
			{
				if(p1.checkPrime(j)) // method calling 
				{
					p1.push(j);
					n++;
					
				}
			}
		}
		
		p1.display();
		System.out.println("***********");
		
	
		

	}

}
