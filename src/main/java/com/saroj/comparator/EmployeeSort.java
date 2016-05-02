package com.saroj.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeSort {
  
public static void main(String[] args) {
  Map<String, Integer> myMap = new HashMap<String, Integer>();
  myMap.put("saroj", 32);
  myMap.put("kumar", 28);
  myMap.put("rout", 34);
  myMap.put("rout1", 35);
  myMap.put("rout2", 30);
  Set<Entry<String, Integer>> mySet = myMap.entrySet();
  List<Entry<String,Integer>> myList = new ArrayList<Entry<String,Integer>>(mySet);
  Collections.sort(myList,new Comparator<Entry<String, Integer>>(){

    public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
      // TODO Auto-generated method stub
      return o1.getValue().compareTo(o2.getValue());
    }
    
  });
  System.out.println("Print::"+myList);
}

}
