package com.saroj.string;

public class RotateAnArray {
	
	private static void rotate(int[] arr, int order){
		if(arr ==null || order < 0){
			throw new IllegalArgumentException("Illegal Argument");
		}
		int a = arr.length-order;
		reverseTheOrder(arr, 0,a-1);
		reverseTheOrder(arr,a,arr.length-1);
		reverseTheOrder(arr, 0, arr.length-1);
	}
	
	public static void reverseTheOrder(int[] arr, int left, int right){
		if(arr.length == 1 || arr == null){
			return;
		}
		while(left < right){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
	private static String reverseWords(String str){
		String[] splitArr = str.split(" ");
		StringBuilder builder = new StringBuilder();
		for(int i = splitArr.length-1; i>=0;i--){
			builder.append(splitArr[i]);
			builder.append(" ");
		}
		return builder.toString();
	}
	
	private static String compressAtring(String str){
		char last = str.charAt(0);
		String myStr="";
		int count = 1;
		for(int i = 0;i<str.length();i++){
			if(str.charAt(i) == last){
				count++;
			}
			else{
				myStr+=last+""+count;
				last = str.charAt(i);
				count=1;
			}
		}
		return myStr+last+count;
	}

	private static boolean isMatch(String s, String p){
		if(s.length()==0){
			return p.length()==0;
		}
		
		if(p.length() == 1 || p.charAt(1) !='*'){
			if(s.length() < 1 || (p.charAt(0) != '.') && s.charAt(0) != p.charAt(0)){
				return false;
			}
			else{
				return isMatch(s.substring(1), p.substring(1));
			}
		}else{
			
		}
		return false;
	}
	public static void main(String[] args) {
		String str = "Saroj kumar rout";
		int[] arr= {1,2,3,4,5,6};
		int order = 2;
		RotateAnArray.rotate(arr, order);
		System.out.println(arr);
	//	String result = RotateAnArray.compressAtring(str);
	//	System.out.println(result);
	}

}
