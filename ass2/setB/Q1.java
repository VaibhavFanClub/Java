interface Operation{
	double PI = 3.142;
	public void area();
	public void volume();
}

class Circle implements Operation{
	double radius;
	public Circle(double r){
		radius = r;
	}
	public void area(){
		System.out.println("Area of circle is: " + (PI * radius * radius));
	}
	public void volume(){
		System.out.println("Circle does not have Volume");
	}
}

class Cylinder implements Operation{
	double radius;
	double height;
	public Cylinder(double r, double h){
		radius = r;
		height = h;
	}
	public void area(){
		System.out.println("Area of cylinder is: " + ((2 * PI * radius * radius) + (2 * PI * radius * height)));
	}
	public void volume(){
		System.out.println("Volume of cylinder is: " + (PI * radius * radius * height));
	}
}

public class Q1{
	public static void main(String args[]){
		Circle c = new Circle(5);
		Cylinder cy = new Cylinder(5, 4);
		c.area();
		c.volume();
		cy.area();
		cy.volume();	
	}
}
