package Sample_Project;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UpdateArrayElement 
{
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("Automation Tester");
		list.add("Manual Tester");
		list.add("Performance Tester");
		list.add("API Tester");
		
		System.out.println("List of Tester...." + list); 
		Iterator<String> itr = list.iterator();
		
		
		System.out.println("====================================");
		System.out.println("Update name is ..." +list.set(2, "Developer"));
		while(itr.hasNext())
		{
			
			System.out.println(" " +itr.next());
			
		}
		
		
	}

}
