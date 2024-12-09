package Sample_Project;

public class Threadby_Implementing_Runnable_Interface_Class 
{
	public static void main(String[] args) 
	{
		Thread t=new Thread();
		System.out.println(t.currentThread());
		t.setName("My Thread");
		System.out.println(t);
		System.out.println();
		for(int i=1;i<=5;i++) {
			System.out.println(t);
			
			try 
			{
				Thread.sleep(2000);
			} catch (Exception e) 
			{
				// TODO: handle exception
				e.printStackTrace();
				
			}
		}
	}

}
