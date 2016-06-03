package com.arpan.atoz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*	Given a set of random strings, write a function that returns 
 	a set that groups all the anagrams together.
 	Ex: star, dog, car, rats, ars - > {(star, rats), (src,car), dog)
 */

public class AnagramSet {

	public static void main(String[] args) {
		String[] StrArr = { "star", "dog", "car", "rats", "ars", "rca" };
		try {
			Map<String, List<String>> anagramGroup = getAnagramGroup(StrArr);
			print(anagramGroup);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Map<String, List<String>> getAnagramGroup(String[] StrArr)
			throws Exception {
		if (StrArr == null) {
			throw new Exception("Input String is null");
		}
		Map<String, List<String>> anagramGroup = new HashMap<String, List<String>>();
		List<String> anagrams = null;
		for (String s : StrArr) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = String.copyValueOf(charArray);
			anagrams = anagramGroup.get(sorted);
			if (anagrams == null) {
				anagrams = new ArrayList<String>();
				anagrams.add(s);
				anagramGroup.put(sorted, anagrams);
			} else {
				anagramGroup.get(sorted).add(s);
			}
		}
		return anagramGroup;
	}

	private static void print(Map<String, List<String>> anagramGroup) {
		Set<Entry<String, List<String>>> entrySet = anagramGroup.entrySet();
		for (Entry<String, List<String>> entry : entrySet) {
			if (entry.getValue() == null) {
				System.out.print("{" + entry.getKey() + "} ");
			} else {
				System.out.print("{");
				for (String s : entry.getValue()) {
					System.out.print(s + " ");
				}
				System.out.print("}");
			}
		}
	}
}