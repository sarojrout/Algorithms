package com.saroj.comparator;

public class Example {
	
	public static boolean compareChar(String s1, String s2){
		char[] charArr1 = s1.toCharArray();
		char[] charArr2 = s2.toCharArray();
		if(s1.length() == s2.length()){
			for(int i = 0; i < s1.length();){
				if(charArr1[i]!=charArr2[i]){
					break;
				}else{
					return true;
				}
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println(Example.compareChar(s1, s2));

	}

}
