package com.saroj.dupcount;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharCheck {
  
  public static boolean isUniqueChar(String str){
   
 //    return true;
   
   // char[] myCharArr =  str.toCharArray();
//    Set<Character> mySet = new HashSet<Character>();
//    
//    for(Character ch:myCharArr){
//      mySet.add(ch);
//      if(mySet.contains(ch)){
//        return true;
//      }
//      else{
//        return false;
//      }
//    }
//   
 //  return false;
    
    if(str.length()>256){
      return false;
    }
    boolean[] myArr = new boolean[256];
    for(int i =0; i<str.length();i++){
      int val = str.charAt(i);
      if(myArr[val]){
        return false;
      }else{
        myArr[val]= true;
        
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String str = "aabc";
    System.out.println(UniqueCharCheck.isUniqueChar(str));
  }

}
