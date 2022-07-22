package main;

public class FirstNonRepeatedChar {

	public char findFirstNonRepeatedChar(String str) {
		
		str = str.toLowerCase();
		str = str.replaceAll("\\s+","");
		
		char solution = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char character = str.charAt(i);
			
			if(str.indexOf(character) == str.lastIndexOf(character)) {
				solution = character;
				break;
			}
			
		}
		return solution;
		
	}
}
