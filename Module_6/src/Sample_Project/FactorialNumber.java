package Sample_Project;

public class FactorialNumber 
{
	public static void main(String[] args) 
	{
		//Example: The factorial of four is \(4!\) \(=4x3x2x1=24\)
		int n = 4;
		long factorial = 1;
		for (int i=1;i<=n;i++)
		{
			factorial *= i;
		}
		   System.out.println("Factorial Number is... " + factorial);
	}

}
