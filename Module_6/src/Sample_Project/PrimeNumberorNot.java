package Sample_Project;

import java.util.Scanner;

public class PrimeNumberorNot {

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number: ");
//        int n = sc.nextInt();
//        int c = 0;

	
		int n = 10;
		int c = 0;
		
		for(int i = 1;i<=n;i++)
		{
			if(n % i == 0)
			{
				c++;
			}
		}
		if(c == 2)
		{
			System.out.println(n + " is prime number");
		}
		else
		{
			System.out.println(n + " is not prime number");
			
		}
	}

}
