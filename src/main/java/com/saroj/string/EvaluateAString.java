package com.saroj.string;

public class EvaluateAString {
/**
 * Given a string of form x + a = b where a and b are integer, 
 * find value of x [Note that spaces may or may not be there, 
 * for example, input can either be x+a=b or x + a = b or x+a = b].
For example if input string is x + 12 = 3 then output should be -9
 * @param args
 */
	public static void main(String[] args) {
		String myStr = "x + 10 = 23";
		int result =EvaluateAString.evaluate(myStr);
		System.out.println(result);
	}

	private static int evaluate(String s){
		String input = s.replaceAll("\\s", "");
		String[] myArr= input.split("\\+")[1].split("=");
		int output = Integer.parseInt(myArr[1])-Integer.parseInt(myArr[0]);
		return output;
	}
}
