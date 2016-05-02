package com.saroj.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
// Find the minimum age
public class Person {
  private int age;
  public Person(int a){
    this.age=a;
  }
public int getAge(){
  return age;
}
  public static void main(String[] args) {
    Person p1 = new Person(20);
    Person p2 = new Person(30);
    Person p3 = new Person(10);
    Person p4 = new Person(25);
    List<Person> myList = new ArrayList<Person>();
    myList.add(p1);
    myList.add(p2);
    myList.add(p3);
    myList.add(p4);
    Collections.sort(myList,new Comparator<Person>(){

      public int compare(Person o1, Person o2) {
        // TODO Auto-generated method stub
        return o1.getAge()-o2.getAge();
      }
      
    });
    System.out.println("Minimum Age of a Person:"+myList.get(0).getAge());
//    for(Person p:myList){
//      System.out.println(p.age);
//    }
  }

}
