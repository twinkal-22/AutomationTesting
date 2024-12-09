package Sample_Project;

import java.util.ArrayList;
import java.util.List;

public class RemoveArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Pineapple");
		
		System.out.println("List of fruits..." + list);
		
		
		System.out.println("Remove fruits..." + list.remove(1));
		
	}

}
