package Sample_Project;

abstract class Parent 
{
    
   abstract void message();
}

class FirstSubclass extends Parent 
{
   void message() 
   {
      System.out.println("This is first subclass");
   }
}

class SecondSubclass extends Parent 
{
   void message() 
   {
      System.out.println("This is second subclass");
   }
}

public class MainClass 
{
	public static void main(String[] args) 
	{
      Parent first = new FirstSubclass();
      first.message(); 
      
      Parent second = new SecondSubclass();
      second.message(); // Calling the message method of SecondSubclass
    }
}
