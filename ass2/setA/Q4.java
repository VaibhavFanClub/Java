import Utility.CapitalString;
import java.util.Scanner;

class Person{
	String name, city;
	public Person(String n, String p){
		this.name = n;
		this.city = p;
	}
	public void display(CapitalString cs){
		System.out.println("Name: " + cs.capitalize(this.name));
		System.out.println("City: " + this.city);
	}
}

public class Q4{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String n = sc.nextLine();
		System.out.print("Enter city: ");
		String c = sc.nextLine();
		CapitalString cs = new CapitalString();
		Person p = new Person(n, c);
		p.display(cs);
	}
}
