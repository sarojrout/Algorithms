package com.saroj.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		System.out.println(Test.combineArray());

	}

	private static List<List<Integer>> combineArray() {
		List<int[]> input = new ArrayList<int[]>();
		int[] a = { 1, 6 };
		int[] b = { 2, 10 };
	//	int[] c = { 3, 18 };
		int[] d = { 20, 21 };
		
		input.add(a);
	//	input.add(c);
		input.add(b);
		input.add(d);
		List<List<Integer>> output = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();
		int start = 0;
		int end = 0;
		for (int i = 0; i < input.size(); i++) {
			start = input.get(i)[0];
			end = input.get(i)[1];
			for (int j = start; j <= end; j++) {
				if (!list.contains(j)) {
					list.add(j);
				}
			}
		}
		List<Integer> innerList = new ArrayList<Integer>();
		Collections.sort(list);
		int temp = list.get(0);
		innerList.add(list.get(0));
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != temp) {
				innerList.add(list.get(i - 1));
				output.add(innerList);
				innerList = new ArrayList<Integer>();
				innerList.add(list.get(i));
				temp = list.get(i);
			}
			temp++;
		}
		innerList.add(list.get(list.size() - 1));
		output.add(innerList);
		return output;
	}

}
