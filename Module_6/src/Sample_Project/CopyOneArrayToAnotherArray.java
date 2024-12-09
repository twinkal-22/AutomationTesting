package Sample_Project;

import java.util.Arrays;

public class CopyOneArrayToAnotherArray 
{
	public static void main(String[] args) 
	{
		int arr1[] = {1,2,3};
		int arr2[] = Arrays.copyOf(arr1, 3);
		
		arr1[0]++;
		System.out.println("");
		
		for(int i=0; i< arr1.length;i++)
			System.out.print(arr1[i] + " ");
		System.out.println("");
		for(int i=0;i<arr2.length;i++)
			System.out.print(arr2[i] + " ");
    }
}
