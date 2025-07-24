import java.io.*;
class Q3{
	public static void BubbleSort(int arr[])
	{
		int i, j, temp;
		int size = arr.length;
		for(i = 1; i < size; i++)
		{
			for(j = 0; j < size - i; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String args[]) throws IOException
	{
		int size, sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("Enter size of array: ");
		size = Integer.parseInt(br.readLine());
		int arr[] = new int[size];
		for(int i = 0;i < size; i++)
		{
			System.out.print("Enter element[" + (i) + "]: ");
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		System.out.print("\nYour Array: ");
		for (int i = 0; i < size; i++)
		{
            		System.out.print(arr[i] + " ");
		}
		BubbleSort(arr);
		System.out.println("\nSum of array elements: " + sum);
		System.out.print("Your Array in Ascending Order: ");
		for (int i = 0; i < size; i++)
		{
	        	System.out.print(arr[i] + " ");
		}
	}
}
