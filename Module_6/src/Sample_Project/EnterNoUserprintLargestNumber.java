package Sample_Project;

import java.util.Scanner;

public class EnterNoUserprintLargestNumber 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c,largest,temp;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No 1: ");
		a = sc.nextInt();
		
		System.out.println("Enter No 2. : ");
		b = sc.nextInt();
		
		System.out.println("Enter No 3: ");
		c = sc.nextInt();
		
		temp = a >b ? a:b;
		
		largest = c>temp ? c:temp;
		
		System.out.println("largest number is..." + largest);

	}

}
