package main;

public class ReverseAString {
	
	public String reverseAString(String str) {
		
		String reversedString = "";
		
		for (int i = str.length()-1; i >=0; i--) {
			reversedString += str.charAt(i);
		}
		return reversedString;
	}

}
