/**
 * 
 */
package com.saroj.dupcount;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author sarojrout
 *
 */
public class DuplicateNum {

	private Map<Integer, Integer> dupCount(int[] a) {
		Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

		for (Integer i : a) {
			if (myMap.containsKey(i)) {
				myMap.put(i, myMap.get(i) + 1);
			} else {
				myMap.put(i, 1);
			}
		}
		return myMap;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 3, 5, 5, 4, 4, 4 };
		DuplicateNum dup = new DuplicateNum();
		Set<Entry<Integer, Integer>> set = dup.dupCount(arr).entrySet();
		List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(
				set);
		Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {

			public int compare(Entry<Integer, Integer> o1,
					Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		for (Entry<Integer, Integer> entry : list) {
			System.out.println(entry.getKey() + "==" + entry.getValue());
		}
		// TODO Auto-generated method stub

	}

}
