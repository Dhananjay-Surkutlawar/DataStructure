package assignmentno1;

public class MergeArray {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {11,22,33,44};
		int res[]=new int [arr1.length+arr2.length];
		int k=0;
		for(int i=0;i<arr1.length;i++)
		{
			res[k++]=arr1[i];
		}
		
		for(int i=0;i<arr2.length;i++)
			{
				res[k++]=arr2[i];
			}
		
		
		System.out.println("*****value of first array*****");
		for(int i =0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("*****value of second array*****");
		for(int i =0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println("");
		System.out.println("");

		
		
		System.out.println("*****AFTER MERGING ARRAY*****");;
		for(int i =0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}

	}

}
