import java.util.*;
import java.io.*;

class Q2
{
	public static void main(String args[])
	{
		Hashtable emps = new Hashtable();
		
		int n;
		String name;
		float salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("\nEnter the number of employees: ");
		n = sc.nextInt();
		
		for(int i = 0; i<n; i++)
		{
			System.out.println("\nEnter Employee[" + i + "]:");
			sc.nextLine();
			
			System.out.print("Enter Employee[" + i + "] Name: ");
			name = sc.nextLine();
			
			System.out.print("Enter Employee[" + i + "] Salary: ");
			salary = sc.nextFloat();
			
			emps.put(name, salary); 
		}
		
		int i = 0;
		
		System.out.println("\nEmployee Details:\n" + emps);
		
		sc.nextLine();
		
		System.out.print("\nYour Search Key: ");
		String key = sc.nextLine();
		
		if(emps.containsKey(key))
		{
			System.out.println("Employee Name: " + key);
			System.out.println("Employee Salary: " + emps.get(key));
		}
		else
		{
			System.out.println(key + " is NOT present in the Hash Table.");
		}
	}
}
