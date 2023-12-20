package com.edu13;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String> aob=new ArrayList();
aob.add("Amit");
aob.add("Samir");
aob.add("Juber");
aob.add("Sanket");

System.out.println(aob);

for ( String i :aob) {
	System.out.println(i);
}
aob.add("Bhushan");
 System.out.println(aob);

 aob.remove(1);
 System.out.println(aob);
 System.out.println(aob.contains("Amit"));
 
 
 /********************************************/
 
 ArrayList<Float> aob1=new ArrayList();

aob1.add(12.1f);
aob1.add(23.3f);
aob1.add(23.4f);
aob1.add(45.45f);

System.out.println(aob1);

// using a for loop 
for ( float i:aob1) { // for Each 
	System.out.println(i);
}
aob1.clear();// to clear all the list
System.out.println(aob1);
aob1.add(12.1f);
aob1.add(23.3f);
aob1.add(23.4f);
aob1.add(45.45f);
System.out.println(aob1);
System.out.println(aob1.contains(23.3f));// for searching the element written the boolean value
	
ArrayList <Float> aob2=new ArrayList();
 
aob1.add(12.13f);
aob1.add(23.25f);
aob1.add(23.10f);
// for cheaking all the element from 1st list to 2nd list 
 System.out.println(aob1.containsAll(aob2));
 // remove the specific index element 
 System.out.println(aob1.remove(2));
 
	}

}
