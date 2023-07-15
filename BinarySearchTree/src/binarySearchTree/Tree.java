package binarySearchTree;

public class Tree
{
	Node root;

	Tree()
	{
		root=null;
	}

	public void addNode(int data)
	{
		Node record=new Node(data);
		if(root==null)
		{
			root=record;
			System.out.println("root is created"+root.data);

			return;

		}
		Node move=root;
		while(true)
		{
			if(record.data<move.data)
			{
				if(move.left==null)
				{
					move.left=record;
					System.out.println("Data added at left "+move.left.data);
					break;
				}
				else 
					move=move.left;
			}
			else if(record.data>move.data)
			{
				if(move.right==null)
				{
					move.right=record;
					System.out.println("Data added at right "+move.right.data);
					break;
				}
				else
					move=move.right;
			}
			else
			{
				System.out.println("WRONG INPUT");
				break;
			} 
		}
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




