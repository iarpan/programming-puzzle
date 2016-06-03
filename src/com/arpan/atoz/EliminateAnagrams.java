package com.arpan.atoz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EliminateAnagrams {

	private static List<String> firstOccurance = new ArrayList<>();

	private EliminateAnagrams() {

	}

	public static List<String> getFirstOccurance() {
		return firstOccurance;
	}

	public static void main(String[] args) {
		String[] strArr = { "star", "dog", "car", "rats", "ars", "rca" };
		try {
			Set<Anagram> distinctAnagrams = getDistinctAnagrams(strArr);
			print(distinctAnagrams);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Set<Anagram> getDistinctAnagrams(String[] strArr)
			throws Exception {
		if (strArr == null) {
			throw new Exception("Input String is null");
		}
		Set<Anagram> distinctAnagrams = new HashSet<>();
		for (String s : strArr) {
			Anagram anagram = new Anagram(s);
			distinctAnagrams.add(anagram);
		}
		return distinctAnagrams;
	}

	private static void print(Set<Anagram> distinctAnagrams) {
		for (Anagram anagram : distinctAnagrams) {
			if (!firstOccurance.contains(anagram.getStr())) {
				System.out.println(anagram.getStr());
			}
		}
	}
}

class Anagram {

	public String str;

	public Anagram(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		if (this.str != null) {
			for (int i = 0; i < str.length(); i++) {
				result += str.charAt(i);
			}
		}
		result = prime * result;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anagram anagram = (Anagram) obj;
		char[] thisArr = this.str.toCharArray();
		char[] charArray = anagram.getStr().toCharArray();
		if (isAnagram(thisArr, charArray)) {
			EliminateAnagrams.getFirstOccurance().add(anagram.getStr());
			return true;
		} else
			return false;
	}

	private boolean isAnagram(char[] thisArr, char[] charArray) {
		Arrays.sort(thisArr);
		Arrays.sort(charArray);
		return String.valueOf(thisArr).equals(String.valueOf(charArray));
	}
}
