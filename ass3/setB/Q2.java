import java.util.*;
import java.io.*;

class Q2
{
	static boolean checkName(String n){
		if(!n.matches("[a-zA-Z]+")){
			return false;
		}
		return true;
	}
	public static void main(String args[])
	{
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		name = sc.next();
		
		try
		{
			if(!checkName(name))
			{
				throw new NameValidationException("\nName is Invalid");
			}
			else
			{
				System.out.println("\nName is valid");
			}
		}
		catch(NameValidationException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

class NameValidationException extends Exception
{
	public NameValidationException(String msg)
	{
		super(msg);
	}
}
