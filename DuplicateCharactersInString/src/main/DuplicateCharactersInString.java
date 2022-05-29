package main;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersInString {
	
	public HashMap<Character, Integer> findDuplicates(String str) {
		HashMap<Character, Integer> charsCount = new HashMap<Character, Integer>();
		
		str = str.toLowerCase();
		
		for(int i=0; i < str.length(); i++) {
			char character = str.charAt(i);
			
			if(charsCount.containsKey(character)) {
				int oldValue = charsCount.get(character);
				charsCount.replace(character, oldValue, oldValue+1);
			} else if(!charsCount.containsKey(character)) {
				charsCount.put(character, 1);

			}
		}
		
		for(Map.Entry<Character, Integer> entry: charsCount.entrySet()) {
			if(entry.getValue() == 1) {
				charsCount.remove(entry.getKey(), entry.getValue());
			}
		}
		return charsCount;
	}

}
