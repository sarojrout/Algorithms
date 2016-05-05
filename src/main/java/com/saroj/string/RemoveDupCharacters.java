package com.saroj.string;

/**
 * Given two strings s1 & s2, remove those characters from first string which are present in second string. 
 * Both the strings are different and contain only lowercase characters.
 * 
 * http://www.practice.geeksforgeeks.org/problem-page.php?pid=550
 */
public class RemoveDupCharacters {
	
	public static void main(String[] args) {
		String s1="removeccharaterfrom";
		String s2= "string";
		String result=RemoveDupCharacters.removeChar(s1, s2);
		System.out.println(result);
	}
	
	private static String removeChar(String s1, String s2){
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		for(int i=0; i<sb2.length();i++){
			for(int j=0; j<sb1.length();j++){
				if(sb2.charAt(i)==sb1.charAt(j)){
					sb1.deleteCharAt(j);
				}
			}
		}
		return sb1.toString();
	}

}
