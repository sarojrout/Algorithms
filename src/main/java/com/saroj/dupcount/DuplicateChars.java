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
public class DuplicateChars {

	private Map<Character, Integer> duplicateChar(String myStr){
		char[] myChar = myStr.toCharArray();
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
		for(Character ch:myChar){
			if(myMap.containsKey(ch)){
				myMap.put(ch, myMap.get(ch)+1);
			}else{
				myMap.put(ch, 1);
			}
		}
		return myMap;
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DuplicateChars dupChar = new DuplicateChars();
		Set<Entry<Character,Integer>> set =  dupChar.duplicateChar("abcccadde").entrySet();
		List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
		Collections.sort(list, new Comparator<Entry<Character,Integer>>(){

			public int compare(Entry<Character, Integer> o1,
					Entry<Character, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getKey().compareTo(o2.getKey());
			}
			
		});
		for(Entry<Character, Integer> entry:list){
			if(entry.getValue() > 1){ //print out only duplicate characters
				System.out.println(entry.getKey()+"==="+entry.getValue());
			}
			
		}
	}

}
