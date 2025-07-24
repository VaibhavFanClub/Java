import Utility.CapitalString;

class Person{
	String name, city;
	public Person(){
		this.name = "om";
		this.city = "pune";
	}
	public void display(CapitalString cs){
		System.out.println("Name: " + cs.capitalize(this.name));
		System.out.println("City: " + this.city);
	}
}

public class Q4{
	public static void main(String args[]){
		CapitalString cs = new CapitalString();
		Person p = new Person();
		p.display(cs);
	}
}
