package tree;

import java.util.Scanner;

import binarySearchTree.Node;

public class TreeNormal 
{
	Node root;

	public TreeNormal()
	{
		root=null;

	}
	public void AddNode(int data)
	{ 
		Scanner sc= new Scanner(System.in);
		Node record=new Node( data);
		Node move=root;
		if(root==null)
		{
			root=record;
			System.out.println("ROOT IS CREATED");
			return ;
		}

		System.out.println("Enter which side you want to add");
		String ans =sc.next();
		if(ans.equalsIgnoreCase("left"))
		{
			while(true)
			{
				if(move.left==null)
				{
					move.left=record;
					break;
				}
				else
					move=move.left;
			}

		}
		else if(ans.equalsIgnoreCase("right"))
				{
					while(true)
					{
						if(move.right==null)
						{
							move.right=record;
							break;
						}
						else
							move=move.right;
						
					}
				}
		else
			System.out.println("wrong choice");


	}
	public void display()
	{
		System.out.println("---------- Inorder -------------");
		System.out.println();
		inorder(root);
		System.out.println();
		System.out.println("---------- Preorder -------------");
		System.out.println();
		preorder(root);
		System.out.println();
		System.out.println("---------- Postorder -------------");
		System.out.println();
		postorder(root);
		System.out.println();

	}
	public void inorder(Node move)
	{

		if(move!=null)
		{
			inorder(move.left);
			System.out.print(" "+move.data);
			inorder(move.right);
		}
	}
	public void preorder(Node move)
	{
		if(move!=null)
		{
			System.out.print(" "+move.data);
			preorder(move.left);
			preorder(move.right);
		}
	}
	public void postorder(Node move)
	{
		if(move!=null)
		{
			postorder(move.left);
			postorder(move.right);
			System.out.print(" "+move.data);
		}
	}
	public void smallest()
	{
		Node move=root;
		
		if(move==null)
			System.out.println("tree is empty");
		else
		{
			while(move.left!=null)
			move=move.left;
			System.out.println("lowest data is "+move.data);
		}
	}
	public void highest()
	{
		Node move=root;
		if(move==null)
			System.out.println("tree is empty");
		else
		{
			while(move.right!=null)
			move=move.right;
			System.out.println("highest data is "+move.data);
		}
	}



}
