import java.io.*;
import java.util.Scanner;
class Q4 {
    public static void main(String args[])  
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter File name: ");
    	String fn = sc.next();
    	
    	int lcount = 0, wcount = 0, ccount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fn)))
        {
            String line;

            while ((line = reader.readLine()) != null) 
            {
            	lcount++;
                
                ccount += line.length();
		
		String[] words = line.split("\\s+");
                wcount += words.length;
            }
            
            reader.close();

        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found.");
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading file.");
        }
        System.out.println("\n\nFile name: " + fn);
    	System.out.println("Number of lines: " + lcount);
    	System.out.println("Number of words: " + wcount);
    	System.out.println("Number of characters: " + ccount);
    }
}

