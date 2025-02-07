package Sample_Project;

public class FindAverageArray
{
	public static void main(String[] args) 
	{
		int ages[] = {22, 23, 13, 35, 48, 26, 87, 70};

		float avg, sum = 0;
		int length = ages.length;
		for (int age : ages) 
		{
		  sum += age;
		}
		
		avg = sum / length;
		System.out.println("The average age is: " + avg);

		
	}

}
