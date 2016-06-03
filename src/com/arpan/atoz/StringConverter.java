package com.arpan.atoz;

import java.util.LinkedList;
import java.util.List;

public class StringConverter {

	public static void main(String[] args) {
		Integer num = -10;
		String numStr = convertIntegerToString(num);
		System.out.println(numStr);
	}

	private static String convertIntegerToString(Integer num) {
		List<String> stack = new LinkedList<>();
		boolean negetive = num < 0 ? true : false;
		if (num < 0) {
			num = (num * -1);
		}
		while (num > 0) {
			stack.add(num % 10 + "");
			num = num / 10;
		}
		if(negetive)
			stack.add("-");
		StringBuilder sb = new StringBuilder();
		for (int i = stack.size() - 1; i >= 0; i--) {
			sb.append(stack.get(i));
		}
		return sb.toString();
	}
}
