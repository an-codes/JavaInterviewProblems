package main;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordSentence {

	int count = 0;
	
	public List<String> createWordArray(String str) {
	
		// we'll use ArrayList since it is an ordered list
		List <String> newArrayList = new ArrayList<String>();
		String newString = "";
		int arrayIndex = 0;
		
		// Create an String array of separate words from within the String
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == ' ') {
				newArrayList.add(arrayIndex, newString);
				arrayIndex++;
				newString = "";
			} else if (i == str.length()-1) {
				newString += ch;
				newArrayList.add(arrayIndex, newString);
				arrayIndex++;
			} else {
				newString += ch;
			}
		}
		
		return newArrayList;
	}
	
	
	public String reverseWords(String str) {
		
		List<String> stringArrayList = createWordArray(str);
		List<String> reversedArrayList = new ArrayList<String>();
		String result = "";
		
		System.out.println(stringArrayList.size());
		for(int i = 0; i < stringArrayList.size(); i++){
			reversedArrayList.add(i, stringArrayList.get(stringArrayList.size()-1-i));
		}
		
		for (int j = 0; j < reversedArrayList.size(); j++) {
			
			result += reversedArrayList.get(j);
			
			if(j != reversedArrayList.size()-1) {
				result += " ";
			}
			
		}
		
		return result;
		
	}
	
}
