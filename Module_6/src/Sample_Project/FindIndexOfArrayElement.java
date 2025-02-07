package Sample_Project;

import java.util.Arrays;

public class FindIndexOfArrayElement
{
	 public static int findIndex(int arr[], int t)
	 {
	      
	   int index = Arrays.binarySearch(arr, t);
	   return (index < 0) ? -1 : index;
	 }

	 public static void main(String[] args){
	      
	 int[] a = { 1, 22, 3, 4, 5, 6, 7 }; 
	 int t = 7;    
	
	 System.out.println("Index of array element..." + findIndex(a, t));
	        
	    }

}
