package Sample_Project;

public class MAX_MIN_NumberOfArray 
{
	static int arr[] = {10, 324, 45, 90, 9808,0}; 
	
	public static int maximum() 
	{ 
		
		int max = arr[0]; 

		for (int i = 1; i < arr.length; i++) 
			if (arr[i] > max) 
				max = arr[i]; 	
		return max; 	
	} 
	public static int minimum()
	{
		int min = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
		
	}
	// Driver method 
	public static void main(String[] args) 
	{ 
		System.out.println("Maximum number is... " + maximum()); 
		System.out.println("Minimum number is... " + minimum());
		
	// using collections 
	/*
	 * int max = Arrays.stream(arr).max().getAsInt(); List<Integer> list = new
	 * ArrayList<>();
	 * 
	 * for(int i=0;i<arr.length;i++) { list.add(arr[i]); }
	 * 
	 * System.out.println("Max number..." + max);
	 */
	} 	

}
