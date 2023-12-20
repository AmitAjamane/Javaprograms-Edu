package com.edu13;
import java.util.ArrayList;
import java.util.Iterator;
public class ArryaListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <Integer> aob=new ArrayList();

aob.add(12);
aob.add(23);
aob.add(23);
aob.add(45);

System.out.println(aob);

// using a for loop 
for ( int i:aob) { // for Each 
	System.out.println(i);
}
aob.clear();// to clear all the list
System.out.println(aob);
aob.add(12);
aob.add(23);
aob.add(56);
aob.add(45);
System.out.println(aob);
System.out.println(aob.contains(23));// for searching the element written the boolean value
	
ArrayList <Integer> aob1=new ArrayList();
 
aob1.add(12);
aob1.add(23);
aob1.add(23);
// for cheaking all the element from 1st list to 2nd list 
 System.out.println(aob.containsAll(aob1));
 // remove the specific index element 
 System.out.println(aob.remove(2));
 
 
 /*****************************************************/
 // another method to print list 
 Iterator <Integer> iob=aob.iterator(); 
 
 while ( iob.hasNext()) {
	 System.out.println(iob.next());
 }
 
 /*****************************************************/
	}

}
