package Sample_Project;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static boolean isArmstrong(int number) 
	{
        int originalNumber = number;
        int sum = 0;
        int numberOfDigits = String.valueOf(number).length();

        while (number > 0) 
        {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
	public static void main(String[] args) 
	{
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int number = scanner.nextInt();
//        scanner.close();
		int number = 123;
        
        if (isArmstrong(number)) 
        {
            System.out.println(number + " is an armstrong number...");
        } else 
        {
            System.out.println(number + " is not an armstrong number...");
        }
    }

}
