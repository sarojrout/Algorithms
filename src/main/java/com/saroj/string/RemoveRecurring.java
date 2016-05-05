package com.saroj.string;

import java.util.HashSet;
import java.util.Set;
/**
 * Given a number, remove recurring digits from it.
 *  All adjacent same occurrences of a digit should be replaced by only 1 digit. 
 *  For example, 111222 should be converted to 12.
 * @author saroj
 *
 */
public class RemoveRecurring {

	public static void main(String[] args) {
		String str = "1122333444555111";
		String result = RemoveRecurring.removeRecur(str);
		System.out.println(result);

	}
// Alternate way. memory consumption more
	private static String removeRecurring(String s, int index){

		for(int i=0; i< s.length()-1; i++){
			if(s.charAt(i) == s.charAt(i+1)){
				s=s.substring(0,i)+s.substring(i+1,s.length());
				i=0;
			}
		
		}
			
	return s;
	}
	
	// efficient way
	private static String removeRecur(String str){
		StringBuilder sb = new StringBuilder();
		sb.append(str.charAt(0));
		for(int i=0; i< str.length()-1; i++){
			if(str.charAt(i) != str.charAt(i+1)){
				sb.append(str.charAt(i+1));
			}
		}
		return sb.toString();
	}
}
