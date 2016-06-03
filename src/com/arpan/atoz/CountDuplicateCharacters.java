package com.arpan.atoz;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Count and print duplicate characters from a String in order.
 * 
 * @author Arpan Das
 *
 */
public class CountDuplicateCharacters {

	public static void main(String[] args) {
		String s = "aafbjsdbjshuwwopwpwdmmscabjdgahgddu";
		try {
			Map<String, Integer> charByCount = getCharacterCount(s);
			Set<Entry<String,Integer>> entrySet = charByCount.entrySet();
			for(Entry<String,Integer> entry : entrySet){
				System.out.println(entry.getKey() + "::" + entry.getValue());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Map<String, Integer> getCharacterCount(String s)	throws Exception {
		if (s == null){
			throw new Exception("Input String is null");
		}
		Map<String, Integer> charByCount = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			String key = String.valueOf(s.charAt(i));
			Integer count = charByCount.get(key);
			if (count == null) {
				charByCount.put(key, 1);
			}else{
				charByCount.put(key, charByCount.get(key)+1);
			}
		}
		return charByCount;
	}

}
