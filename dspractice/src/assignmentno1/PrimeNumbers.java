package assignmentno1;

public class PrimeNumbers {
	
	public static boolean checkPrime(int a)
	{
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				return false;
			
			}
		}
		return true;
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****PRIME NUMBERS FROM 1 TO 100***** ");
		
		
		for(int j=2;j<=100;j++)
		{
			if(checkPrime(j)) // method calling 
			{
				System.out.println(j);
				
			}
		}

	}

}
