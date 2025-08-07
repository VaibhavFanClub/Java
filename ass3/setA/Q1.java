import java.util.*;

public class Q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of integers: ");
		int n = sc.nextInt();
		SortedSet<Integer> ss = new TreeSet<Integer>();
		for(int i = 0; i < n; i++){
			System.out.print("Enter element " + (i+1) + ": ");
			ss.add(sc.nextInt());
		}
		System.out.println("\nEntered values are: ");
		System.out.println(ss);
		
		System.out.print("\nEnter element to search: ");
		int key = sc.nextInt();
		String res = !ss.contains(key) ? "\nItem not found" : "\nItem found";
		System.out.println(res);
		sc.close();
	}
}
