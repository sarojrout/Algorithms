/**
 * 
 */
package com.saroj.string;

/**
 * @author sarojrout
 *
 */
public class ReverseAString {
	static String reverse="";
	private static String reverseString(String str){
		if(str.length() == 1){
			return str;
		}else{
			reverse +=str.charAt(str.length()-1)+reverseString(str.substring(0, str.length()-1));
			return reverse;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcd";
		System.out.println(ReverseAString.reverseString(str));

	}

}
