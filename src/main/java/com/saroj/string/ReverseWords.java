package com.saroj.string;

public class ReverseWords {
	

//	public static String reverse(String wholeSentence){
//	     
//
//		String[] words = wholeSentence.split(" "); 
//		String rev = ""; 
//		for(int i = words.length - 1; i >= 0 ; i--) { 
//			rev += words[i] + " "; 
//		}
//		return rev;
//	}
	
	//Using String Builder
	
	public static String reverse(String str){
		String[] words = str.split(" ");
		StringBuilder builder = new StringBuilder("");
		for(int i = words.length-1;i>=0;i--){
			builder.append(words[i]);
			builder.append(" ");
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		String str="hello world saroj";
		System.out.println(ReverseWords.reverse(str));

	}

}
