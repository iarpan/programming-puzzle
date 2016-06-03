package com.arpan.linked.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class RetainNAndDeleteM {

	/**
	 * From the list retain n and delete m till the end of the list
	 * 
	 * @param list
	 * @param n
	 * @param m
	 */
	private static void retainNDeleteM(List<Integer> list, int n, int m) {
		if (list == null || list.isEmpty())
			return;
		int tempN = n;
		int tempM = m;
		Iterator<Integer> listItr = list.iterator();
		while (listItr.hasNext()) {
			if (tempN > 0) {
				listItr.next();
				tempN--;
			} else if (tempM > 0) {
				listItr.next();
				listItr.remove();
				tempM--;
			} else {
				tempN = tempN == 0 ? n : tempN;
				tempM = tempM == 0 ? m : tempM;
			}
		}
	}

	/*
	 * Input: N = 1, M = 1 Linked List: 1->2->3->4->5->6->7->8->9->10 Output:
	 * Linked List: 1->3->5->7->9
	 */
	@Test
	public void Test3() {
		List<Integer> list = getList(10);
		retainNDeleteM(list, 1, 1);
		System.out.println(list);
	}

	/*
	 * Input: N = 3, M = 2 Linked List: 1->2->3->4->5->6->7->8->9->10 Output:
	 * Linked List: 1->2->3->6->7->8
	 */
	@Test
	public void Test2() {
		List<Integer> list = getList(10);
		retainNDeleteM(list, 3, 2);
		System.out.println(list);
	}

	/*
	 * Input: N = 2, M = 2 Linked List: 1->2->3->4->5->6->7->8 Output: Linked
	 * List: 1->2->5->6
	 */
	@Test
	public void Test1() {
		List<Integer> list = getList(8);
		retainNDeleteM(list, 2, 2);
		System.out.println(list);
	}

	private List<Integer> getList(int val) {
		List<Integer> list = new LinkedList<>();
		for (int i = 1; i <= val; i++) {
			list.add(i);
		}
		return list;
	}
}
