package com.saroj.linkedList;

public class LengthOfLastWord {
	
	private static int length(String str){
		String[] splitArr = str.split(" ");
		int result = 0;
		boolean flag=false;
		for(int i = str.length()-1; i>0;i--){
			char c = str.charAt(i);
			if((c >='a' && c<= 'z') || (c >='A' && c <= 'Z')){
				flag = true;
				result++;
			}
			else{
				if(flag)
					return result;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "dghjk gekqk abcde";
		int result = LengthOfLastWord.length(str);
		System.out.println(result);
	}

}
