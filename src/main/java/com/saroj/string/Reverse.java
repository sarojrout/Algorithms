package com.saroj.string;

public class Reverse {
	
	private static String reverseStr(String str){
		String newStr = "";
		for(int i=str.length()-1;i>=0;i--){
			newStr +=str.charAt(i);
			//System.out.println(str.charAt(i));
		}
		return newStr;
	}
	public static void main(String[] args) {
		String result = Reverse.reverseStr("reverse");
		System.out.println(result);
	}

}
