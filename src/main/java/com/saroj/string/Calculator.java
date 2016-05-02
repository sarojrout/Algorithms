//package com.saroj.string;
//
//import java.util.Stack;
//
//public class Calculator {
//	
//	public static int calculate(String[] tokens){
//		String operator = "+-*/";
//		Stack<String> myStack = new Stack<String>();
//		for(String token:tokens){
//			if(!operator.contains(token)){
//				myStack.push(token);
//			}else{
//				int a = Integer.valueOf(myStack.pop());
//				int b = Integer.valueOf(myStack.pop());
//				switch(token){
//				case "+":
//					myStack.push(String.valueOf(a+b));
//					break;
//				case "-":
//					myStack.push(String.valueOf(b-a));
//					break;
//				case "*":
//					myStack.push(String.valueOf(a*b));
//					break;
//				case "/":
//					myStack.push(String.valueOf(b/a));
//					break;
//				}
//			}
//		}
//		int returnValue = Integer.valueOf(myStack.pop());
//		return returnValue;
//	}
//
//	public static void main(String[] args) {
//		String[] myStrArr = new String[]{"1","2","4","+","3","*","+"};
//		int result = Calculator.calculate(myStrArr);
//		System.out.println(result);
//	}
//
//}
