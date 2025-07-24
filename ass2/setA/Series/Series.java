package Series;

public class Series{
	public void fibonacci(int n){
		int first = 0, second = 1, c, next;
		System.out.println("Fibonacci series");
		for(int i = 0; i < n; i++){
			if (i <= 1)
				next = i;
			else{
				next = first + second;
				first = second;
				second = next;
			}
			System.out.println(next);
		}
	}
	public void cube(int n){
		System.out.println("Cube of the no is: " + (n * n * n));
	}
	public void square(int n){
		System.out.println("Square of the no is: " + (n * n));
	}
}
