package Sample_Project;

import java.util.Scanner;

public class SecondLargestArray 
{
	public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
      
        if (n < 2) 
        {
            System.out.println("Array should have at least two elements.");
            return;
        }
  
        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
 
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) 
        {
            if (array[i] > firstLargest) 
            {
              secondLargest = firstLargest; 
              firstLargest = array[i]; 
            } 
            else if (array[i] > secondLargest && array[i] != firstLargest) 
            {
              secondLargest = array[i]; 
            }
        }

        if (secondLargest == Integer.MIN_VALUE) 
        {
            System.out.println("There is no second largest element in the array.");
        } else {
            System.out.println("The second largest element in the array is: " + secondLargest);
        }

    }

}
