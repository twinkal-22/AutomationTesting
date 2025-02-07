package Sample_Project;

class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
      super(message);
    }
}

class BankAccount 
{
    private double balance;

    public BankAccount(double balance) 
    {
       this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException 
    {
       if (amount > balance) 
       {
          double shortage = amount - balance;
          throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortage + " Rs. To perform this transaction.");
       }
       else 
       {
          balance -= amount;
          System.out.println("Withdrawal successful! Remaining balance: " + balance + " Rs.");
       }
    }
	public double getBalance() 
	{
	   return balance;
	}
}
public class BankTransaction 
{
	public static void main(String[] args) 
	{
       BankAccount account = new BankAccount(2000); // Initial account balance

       double withdrawAmount = 2500; 

       try 
       {
           System.out.println("Account balance: " + account.getBalance() + " Rs.");
           System.out.print("Enter withdraw amount: " + withdrawAmount + " Rs.\n");
           account.withdraw(withdrawAmount);
        } 
       catch (InsufficientBalanceException e) 
       {
           System.out.println(e.getMessage());
       }
    }
}
