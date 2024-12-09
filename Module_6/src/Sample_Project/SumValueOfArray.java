package Sample_Project;

public class SumValueOfArray 
{
	public static void main(String[] args) 
	{
		int[] sum = new int[] {11,2,3,14,5};
		int count=0;
		
		for(int i=0;i<sum.length;i++)
		{
			count = count + sum[i];
		}
		
		System.out.println("Total sum is..."+ count);
		
	}

}
