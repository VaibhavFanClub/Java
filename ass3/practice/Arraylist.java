import java.util.Scanner;
import java.util.ArrayList;

public class Arraylist{
	public static void main(String args[]){
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no of elements: ");
		n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("\nEnter elements in arraylist: ");
		
		for(int i = 0; i < n; i++){
			System.out.print("Enter element " + (i+1) + ": ");
			arr.add(sc.nextInt());
		}
		
		System.out.println("\nEntered elements are: ");
		
		for(int i = 0; i < n; i++){
			System.out.print("Element " + (i+1) + ": " + arr.get(i) + "\n");
		}
	}
}
