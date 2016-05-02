//package com.saroj.string;
//
//import java.util.Arrays;
//import java.util.Comparator;
//
//public class LargestNumber {
//
//	public static String formLargest(int[] nums){
//		String[] str = new String[nums.length];
//		for(int i=0; i<nums.length; i++){
//	        str[i] = String.valueOf(nums[i]);
//	    }
//		Arrays.sort(str, new Comparator<String>() {
//
//			@Override
//			public int compare(String s1, String s2) {
////				String leftRight = s1+s2;
////				String rightLeft = s2+s1;
//				return s2.compareTo(s1);
//			}
//			
//		});
//		StringBuilder sb = new StringBuilder();
//		for(String s: str){
//			sb.append(s);
//		}
////		if(sb.charAt(0)=='0' && sb.length() >1){
////			sb.deleteCharAt(0);
////		}
//		return sb.toString();
//	}
//	public static void main(String[] args) {
//		int[] arr = {2,3,45,5,0};
//		String result = LargestNumber.formLargest(arr);
//		System.out.println(result);
//	}
//}
