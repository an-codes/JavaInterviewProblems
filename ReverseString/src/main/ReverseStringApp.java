package main;

public class ReverseStringApp {

	public String reverseString(String str) {
	
		String reversedStr = "";

		
		for(int i=0; i < str.length(); i++) {
			int number=str.length()-1-i;
			reversedStr = reversedStr + str.charAt(number);
		}
	
		return reversedStr;
	}
	
}
