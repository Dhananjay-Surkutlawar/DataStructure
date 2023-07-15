package assignment3Stack;

import java.util.Scanner;

public class BracketsMain
{
	public static void main(String[] args) 
	{
		BracketsStack b1=null;
		int size;
		char a;
		char b='*';
		boolean flag=true;
		System.out.println("ENTER THE SIZE OF STACK");
		Scanner sc= new Scanner(System.in);
		size=sc.nextInt();
		b1=new BracketsStack(size);
		String str;
		System.out.println("ENTER YOUR STRING");
		str=sc.next();
		for(int i=0;i<str.length();i++)
		{
			a=str.charAt(i);
			if(a=='{' || a=='['|| a=='(')
			b1.push(a);
			
			else
				b= b1.pop();
			
			if(b=='}' && a!='{')
			{
				flag= false;
				break;
			}
			else if(b==']' && a!='[')
			{
				flag= false;
				break;
			}
			else if(b==')' && a!='(')
			{
				flag= false;
				break;
			}
		}
		
		if(b1.isEmpty()&& flag==true)
		{
			System.out.println("balanced parantheses");
		}
		else
			System.out.println("not balanced parantheses");
		
	}

}
