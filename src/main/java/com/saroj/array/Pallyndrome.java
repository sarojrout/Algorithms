/**
 * 
 */
package com.saroj.array;

/**
 * @author sarojrout
 *
 */
public class Pallyndrome {
	
	public static boolean isPallyndrome(String s){
		StringBuilder sb = new StringBuilder(s);
		int length= sb.length();
		for(int i =0; i < length;i++){		
				if(sb.charAt(i) != sb.charAt(length-1-i)){
					return false;
				}
				i++;				
		}
		
		return true;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isPallyndrome("abcde"));

	}
	
	private static boolean isPalindrom(String str){
		int startIndex=0;
		int endIndex = str.length()-1;
		while(endIndex > startIndex){
			if(str.charAt(startIndex) != str.charAt(endIndex)){
				return false;
			}
			++startIndex;
			--endIndex;
		}
		return true;
	}

}
