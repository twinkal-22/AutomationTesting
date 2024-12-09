package Sample_Project;

import java.util.Scanner;

public class Try_CatchBlock 
{
	public static void main(String[] args) 
	{
		int  a,b;
		try 
		{
			Scanner sc = new Scanner(System.in);
		//	sc.nextInt();
			
			System.out.println("Enter Number A:");
			a = sc.nextInt();
			
			System.out.println("Enter Number B:");
			b= sc.nextInt();
			
			if(a==b)
			{
				System.out.println("Pass...");
			}
			else
			{
				System.out.println("Fail...");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Please enter same numbers....");
		}
		
	
		
	}

}
