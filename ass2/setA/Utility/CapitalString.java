package Utility;

public class CapitalString{
	public String capitalize(String s){
		char c = Character.toUpperCase(s.charAt(0));
		String finalS = c + "";
		for(int i = 1; i < s.length(); i++){
			finalS += s.charAt(i);
		}
		return finalS;
	}
}
