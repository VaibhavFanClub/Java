import Series.*;
import java.io.*;

public class Q2{
	public static void main(String args[]) throws IOException{
		Series c = new Series();
		int i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Enter a num / 0 to exit");
			i = Integer.parseInt(br.readLine());
			c.fibonacci(i);
			c.cube(i);
			c.square(i);
		} while(i > 0);
	}
}
