/*Create a user defined Exception class called InsufficientFundsException
(Note: Use the existing Account Class (created in lab3))
Handle an exception for Withdraw(int amt) in Account class
Withdraw(int amt) should throw InsufficientFundsException if the amount to be
withdrawn is greater than the balance.
Accept the values from user for creating Account object and amt to withdraw*/
package exception;
import java.util.Scanner;
public class InsufficientFundsException extends RuntimeException //extends RuntimeException 
{
	static int bal;
	
	
	static class Account
	{
		
		
		public static void Withdraw(int amt)throws Exception
		{
			
			try
			{
				if(amt>bal)
				{
					throw new InsufficientFundsException ();
				}
				else
				{
					bal = bal - amt;
					System.out.println(bal);
				}
			}
			catch(InsufficientFundsException e)
			{
				System.out.println("InsufficientFunds");
			}
		}

		
	}
}
			