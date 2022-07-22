package main;

public class CheckIfAnagram {

	public boolean checkIfAnagram (String str1, String str2) {
		
	// Remove white spaces from the string
	str1 = str1.replaceAll("\\s+","");
	str2 = str2.replaceAll("\\s+","");

	// toLower case
	str1 = str1.toLowerCase();
	str2 = str2.toLowerCase();

	boolean result = false;
	int count=0;

	if(str1.length() != str2.length()) {
		result=false;
	} else {
		
		for(int i = 0; i < str1.length(); i++) {
			char character = str1.charAt(i);

				if(str2.indexOf(character) != -1) {
					count++;
				}
			
		}
		
		if(count==str1.length()) {
			result=true;
		}
		
	}
	
	
		
		return result;
	}
}
