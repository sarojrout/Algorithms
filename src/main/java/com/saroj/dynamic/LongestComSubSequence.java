package com.saroj.dynamic;

public class LongestComSubSequence {

	public static void main(String[] args) {
		String str1 = "ABCDEFHI";
		String str2 = "BDGIKLMNOP";
		int result = LongestComSubSequence.findLongestSub(str1, str2);
		System.out.println("longest subsequence::"+result);

	}
	
//	private static int lcs(String str1, String str2){
//		int max =0;
//		char[] input1 = str1.toCharArray();
//		char[] input2 = str2.toCharArray();
//		int[][] tempArr = new int[input1.length+1][input2.length+1]; 
//		for(int i=1;i<tempArr.length;i++){
//			for(int j=1;j<tempArr[i].length;j++){
//				if(input1[i-1] == input2[j-1]){
//					tempArr[i][j]=tempArr[i-1][j-1]+1;
//				}else {
//					tempArr[i][j] = Math.max(tempArr[i-1][j], tempArr[i][j-1]);
//				}
//				if(tempArr[i][j] > max){
//					max=tempArr[i][j];
//				}
//			}
//		}
//		return max;
//	}
	
	private static int findLongestSub(String s1, String s2){
		StringBuilder sb1 = new StringBuilder(s1);
		StringBuilder sb2 = new StringBuilder(s2);
		
		int count=0;
	
		for(int i=0; i<sb1.length();i++){
			for(int j=0;j<sb2.length();j++){
				if(sb1.charAt(i)== sb2.charAt(j)){
					sb2.deleteCharAt(j);
					count++;
					break;
				}
				
			}
		}
		return count;
	}

}
