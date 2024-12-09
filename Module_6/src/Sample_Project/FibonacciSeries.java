package Sample_Project;

public class FibonacciSeries 
{
		 static int fibonacci(int n)
		{
			if(n<=1)
			
				return n;

			return fibonacci(n-1) + fibonacci(n-2);
		
		}
		public static void main(String[] args) 
		{
			int count=10;
			System.out.println("Fibonacci Series...");
			for(int i=1;i<=count;i++)
			{
				System.out.print(fibonacci(i) + " ");
			}
			
		}
}
