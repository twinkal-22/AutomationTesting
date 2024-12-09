package Sample_Project;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateElement_ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Tops courses list ");
		list.add("Java Developer");
		list.add("ReactJS");
		list.add("S/W Testing");
		list.add("Paython Develeper");
		
		
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext())
		{
			System.out.println(itr.next() + " ");
		}
		
		
	}

}
