package com.arpan.string;

public class FindLongestPalindromeBF {

	private FindLongestPalindromeBF() {
	}

	public static void main(String[] args) {

		String s = "abndaccadaaaaaaa";
		int max = 0;
		String maxPal = null;

		for (int i = 0; i <= s.length(); i++) {
			for (int j = i; j <= s.length(); j++) {
				String subStr = s.substring(i, j);
				if (isPalindrome(subStr) && subStr.length() > max) {
					max = subStr.length();
					maxPal = subStr;
				}
			}
		}
		System.out.println("Length > " + max + "::: max pal>>" + maxPal);
	}

	private static boolean isPalindrome(String subStr) {
		if (subStr != null && subStr.length() > 0) {
			int i = 0;
			int j = subStr.length() - 1;
			while (i < j) {
				if (subStr.charAt(i) == subStr.charAt(j)) {
					i++;
					j--;
					continue;
				} else
					return false;
			}
		}
		return true;
	}
}
