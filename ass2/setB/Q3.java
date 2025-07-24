import java.util.Scanner;

abstract class Staff{
	protected String name, address;
	public Staff(String n, String a){
		name = n;
		address = a;
	}
	abstract void calculateSalary();
	abstract void display();
}

class FullTimeStaff extends Staff{
	String department;
	double salary, bs;
	public FullTimeStaff(String n, String a, String d, double bs){
		super(n, a);
		department = d;
		this.bs = bs;
	}
	public void calculateSalary(){
		salary = bs + (0.08 * bs) + (0.05 * bs);
	}
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Department: " + department);
		System.out.println("Salary: " + salary);
	}
}

class PartTimeStaff extends Staff{
	double salary, rateperhr;
	int noofhrs;
	public PartTimeStaff(String n, String a, int nh, double rh){
		super(n, a);
		noofhrs = nh;
		rateperhr = rh;
	}
	public void calculateSalary(){
		salary = noofhrs * rateperhr;
	}
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Salary: " + salary);
	}
}

public class Q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of objs: ");
		int no = sc.nextInt();
		sc.nextLine();
		Staff s[] = new Staff[no];
		for(int i = 0; i < no; i++){
			System.out.print("\nEnter 1 for Full time and 2 for part time: ");
			int choice = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter name: ");			
			String n = sc.nextLine();
			System.out.print("Enter address: ");			
			String a = sc.nextLine();
			if(choice == 1){
				System.out.print("Enter department:");			
				String d = sc.nextLine();
				System.out.print("Enter Base salary: ");			
				double bs = sc.nextDouble();
				sc.nextLine();
				s[i] = new FullTimeStaff(n, a, d, bs);
			}else{
				System.out.print("Enter no of hours worked:");			
				int nhr = sc.nextInt();
				sc.nextLine();
				System.out.print("Enter rate per hour: ");			
				double rph = sc.nextDouble();
				sc.nextLine();
				s[i] = new PartTimeStaff(n, a, nhr, rph);
			}
		}
		System.out.println("\n\nDetails of staff:");
		for(int i = 0; i < no; i++){
			s[i].calculateSalary();
			System.out.println("\nStaff " + (i + 1) + ":");
			s[i].display();
		}
		sc.close();
	}
}
