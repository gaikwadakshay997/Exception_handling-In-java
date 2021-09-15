/*Create a userdefined Exception classes IncorrectAgeException &
IncorrectNationalityException
Write a class Voter with constructors and methods toString(), check(String name, int age)
The check (…) should check for Nationality and age for voting and throw appropriate
Exception
Accept the Name, Nationality & age from user */

package exception;
import java.util.Scanner;

public class IncorrectAgeException extends RuntimeException
{
	
	public static class IncorrectNationalityException extends IncorrectAgeException 
	{
		public static  class voter
		{
			voter()
			{
				
			}
				public static  void check(String name,int age)throws Exception
				{
					
					try
					{
						if(name != "indian")
						{
							if(age<18)
							{
								throw new  IncorrectAgeException ();
							}
							else
							{
								System.out.println("eligible for voting");							}
						}
					}
					catch( IncorrectAgeException  v)
					{
						System.out.println("not eligible for voting");
					}
				}
				
				}
			}
		}
	
	
						