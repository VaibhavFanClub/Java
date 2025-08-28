import java.util.Scanner;

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public void display(){
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Price = " + price);
	}
	public double getPrice(){
		return price;
	}
	public String getName(){
		return name;
	}
}

public class ProductEx{
	public static void main(String args[]){
		int n = 5;
		Scanner sc = new Scanner(System.in);
		int id;
		String name;
		double price, minP;
		Product[] p = new Product[n];
		System.out.println("Enter details of " + n + " products: ");
		for(int i = 0; i < n; i++){
			System.out.println("\nProduct " + (i + 1) + ":");
			System.out.print("Id: ");
			id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Price: ");
			price = sc.nextDouble();
			sc.nextLine();
			p[i] = new Product(id, name, price);
		}
		
		System.out.println("\n\nProduct having minimum price: ");
		minP = p[0].getPrice();
		for(int i = 1; i < n; i++){
			if (p[i].getPrice() < minP){
				minP = p[i].getPrice();
			}
		}
		int count = 1;
		for(int i = 0; i < n; i++){
			if (p[i].getPrice() == minP){
				System.out.println(count + ". " + p[i].getName());
				count++;
			}
		}
	}
}
