package sorting_AND_search;
import java.util.Scanner;

public class BinarySearch
{
	public static int  binarySearch(int arr[],int key)
	{
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==key)
			{
				System.out.println("your array element is at  index "+ mid);
				return arr[mid];
			}
			else if(arr[mid]<key)
			{
					left=mid+1;
			}
			else 
			{
				right=mid-1;
				
			}
			
		}
		return -1;
		
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
		
		int arr[]= {11,22,44,55,66,77,88,99,100};
		Scanner sc=new Scanner(System.in);
		int key;
	
		System.out.println("ENTER THE ELEMENT TO FIND");
		key=sc.nextInt();
		int a=binarySearch(arr, key);
		if(a==key)
			System.out.println("ELEMENT IS IN ARRAY");
			
		
		else
			System.out.println("ELEMENT IS NOT IN ARRAY");
		
	}

}