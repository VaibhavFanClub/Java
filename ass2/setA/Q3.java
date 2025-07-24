import java.util.Scanner;

class Employee{
	protected int id;
	protected String name;
	protected float salary;
	public Employee(){
		this.id = 0;
		this.name = "";
		this.salary = 0.0f;
	}
	public void acceptEmployee(Scanner sc){
		System.out.print("Enter id: ");
		this.id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name: ");
		this.name = sc.nextLine();
		System.out.print("Enter salary: ");
		this.salary = sc.nextFloat();
	}
	public void displayEmployee(){
		System.out.println("Id: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Salary: " + this.salary);
	}
}

class Manager extends Employee{
	float bonus;
	public Manager(){
		super();
		this.bonus = 0.0f;
	}
	public void acceptManager(Scanner sc){
		this.acceptEmployee(sc);
		System.out.print("Enter Bonus: ");
		this.bonus = sc.nextFloat();
	}
	public void displayManager(){
		this.displayEmployee();
		System.out.println("Bonus: " + this.bonus);
		System.out.println("Total Salary: " + (this.salary + this.bonus));
	}
	public float getTotalSalary(){
		return this.salary + this.bonus;
	}
}

public class Q3{
	public static void main(String args[]){
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of obj: ");
		size = sc.nextInt();
		Manager m[] = new Manager[size];
		System.out.println("Enter data:");
		for(int i = 0; i < size; i++){
			m[i] = new Manager();
			System.out.println("\nEnter details of Worker " + (i+1) + ": ");
			m[i].acceptManager(sc);
		}
		System.out.println("\nDisplay data:");
		for(int i = 0; i < size; i++){
			System.out.println("\nDetails of Worker " + (i+1) + ": ");
			m[i].displayManager();
		}
		System.out.println("\nWorker with maximum salary: ");
		float max = m[0].getTotalSalary();
		for(int i = 1; i < size; i++){
			if(m[i].getTotalSalary() > max)
				max = m[i].getTotalSalary();
		}
		int count = 1;
		for(int i = 0; i < size; i++){
			if(m[i].getTotalSalary() == max){
				System.out.println("\nWorker " + count + ": ");
				m[i].displayManager();
				count++;
			}
		}
	}
}
