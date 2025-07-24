
class Point{
	protected int x, y;
	public Point(){
		this.x = 0;
		this.y = 0;
	}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void displayPoint(){
		System.out.println("x = " + this.x + ", y = " + this.y);
	}
}

class ColorPoint extends Point{
	protected String color;
	public ColorPoint(){
		super();
		this.color = "NA";
	}
	public ColorPoint(int x, int y, String color){
		super(x, y);
		this.color = color;
	}
	public void displayColorPoint(){
		System.out.println("color = " + this.color);
	}
}

class Point3D extends Point{
	protected int z;
	public Point3D(){
		super();
		this.z = 0;
	}
	public Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
	public void displayPoint3D(){
		System.out.println("z = " + this.z);
	}	
}

public class Q1{
	public static void main(String args[]){
		ColorPoint obj1 = new ColorPoint(2, 6, "red");
		Point3D obj2 = new Point3D(7, 4, 3);
		System.out.println("ColorPoint: ");
		obj1.displayPoint();
		obj1.displayColorPoint();
		System.out.println("Point3D: ");
		obj2.displayPoint();
		obj2.displayPoint3D();
	}
}
