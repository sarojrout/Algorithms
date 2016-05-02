package com.saroj.stack;

import java.util.Stack;

public class ReversePolishNotation {
	
	private static int calRPN(String[] arr){
		int result=0;
		String operators="+-*/";
		Stack<String> myStack = new Stack<String>();
		for(String str:arr){
			if(!operators.contains(str)){
				myStack.push(str);
			}else{
				int a = Integer.valueOf(myStack.pop());
				int b = Integer.valueOf(myStack.pop());
				switch(str){
				case "+":
					myStack.push(String.valueOf(a+b));
					break;
				case "-":
					myStack.push(String.valueOf(b-b));
					break;
				case "*":
					myStack.push(String.valueOf(a*b));
					break;
				case "/":
					myStack.push(String.valueOf(a/b));
					break;
				}
			}
		}
		result = Integer.valueOf(myStack.pop());
		return result;
	}

	public static void main(String[] args) {
		String[] arr = new String[]{"2","3","+","5","*"};
		int result = ReversePolishNotation.calRPN(arr);
		System.out.println(result);

	}

}
