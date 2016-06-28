/**
 * 
 */
package com.saroj.array;

/**
 * @author saroj
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String s1 = "abcde";
		String s2 = "efg";
		System.out.println(Anagram.isAnagram(s1, s2));

	}
	
	private static boolean isAnagram(String s1, String s2){
		
		for(int i=0; i< s1.length(); i++){
			for(int j=0; j< s2.length(); j++){
				if(s1.charAt(i)==s2.charAt(j)){
					String temp = s1.substring(i, i+1);
					s2 = s2.replace(temp, "");
				}
			}
		}
		if(s2.isEmpty()){
			return true;
		}
		return false;
	}

}
