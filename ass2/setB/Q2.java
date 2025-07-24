
class Employee{
	protected String name;
	protected double salary;
	public Employee(String n, double s){
		name = n;
		salary = s;
	}
	public void displayEmp(){
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}

class Developer extends Employee{
	protected String projectname;
	public Developer(String n, double s, String pn){
		super(n, s);
		projectname = pn;
	}
	public void displayDev(){
		displayEmp();
		System.out.println("Project Name: " + projectname);
	}
}

class Programmer extends Developer{
	protected String proglanguage;
	public Programmer(String n, double s, String pn, String plang){
		super(n, s, pn);
		proglanguage = plang;
	}
	public void displayProg(){
		displayDev();
		System.out.println("Programming language: " + proglanguage);
	}
}

public class Q2{
	public static void main(String args[]){
		Programmer p = new Programmer("Ashish", 500, "ERP", "html");
		p.displayProg();
	}
}
