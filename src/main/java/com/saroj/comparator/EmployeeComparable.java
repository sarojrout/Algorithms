package com.saroj.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee implements Comparable<Employee>{
  private int age;
  private int salary;
  private String name;
  
  public int compareTo(Employee obj){
    return this.age - obj.age;
  }
  public Employee(int a, int s, String n){
    this.age=a;
    this.salary=s;
    this.name=n;
  }
  public static final Comparator<Employee> ageComparator = new Comparator<Employee>(){

    public int compare(Employee o1, Employee o2) {
      // TODO Auto-generated method stub
      return o1.age-o2.age;
    }
    
  };
  
  public static final Comparator<Employee> nameComp = new Comparator<Employee>(){

    public int compare(Employee o1, Employee o2) {
      // TODO Auto-generated method stub
      return o1.name.compareTo(o2.name);
    }
    
  };
  
  public static final Comparator<Employee> salComp = new Comparator<Employee>(){

    public int compare(Employee o1, Employee o2) {
      // TODO Auto-generated method stub
      return o1.salary-o2.salary;
    }
    
  };
  
  @Override
  public boolean equals(Object obj){
    if(obj == null){
      return false;
    }
    if(getClass() !=obj.getClass()){
      return false;
    }
    final Employee other = (Employee)obj;
    if(this.age != other.age){
      return false;
    }
    if((this.name == null)?(other.name != null):!this.name.equals(other.name)){
      return false;
    }
    if(this.salary !=other.salary){
      return false;
    }
    return true;
  }
  
  public int hashCode(){
    int hash = 5;
    hash=47*hash+this.age;
    hash=47*hash+this.salary;
    
    return hash;
  }
  
  public String toString(){
    return "Employee{"+ "age="+age+" ,name="+name+" ,Sal="+salary+" }";
    
  }
  
}
public class EmployeeComparable {
  public static void main(String[] args) {
    Employee emp = new Employee(24,2000,"kumar");
    Employee emp1 = new Employee(28,3000,"rout");
    Employee emp2 = new Employee(20,1000,"saroj");
    Employee emp3 = new Employee(34,4000,"rout1");
    
    List<Employee> myList = new ArrayList<Employee>();
    myList.add(emp);
    myList.add(emp1);
    myList.add(emp2);
    myList.add(emp3);
    Collections.sort(myList, Employee.nameComp);
    Collections.sort(myList, Employee.ageComparator);
    Collections.sort(myList, Employee.salComp);
    
    System.out.println(myList);
  }
  
  
}
