package com.edu13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListSort_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList <Integer> aob=new ArrayList();

		aob.add(12);
		aob.add(23);
		aob.add(43);
		aob.add(45);
		aob.add(14);
		aob.add(53);
		aob.add(20);
		aob.add(78);
		
		// sorting 
 Collections.sort(aob);
		System.out.println(" Sorting in asending :"+aob);
 Collections.reverse(aob);
        System.out.println("Sorting in desendign :"+aob );
		
        // swapping
 Collections.swap(aob, 2, 6);
       System.out.println("Swaping :"+aob);
		
       // suffuling
 Collections.shuffle(aob);
 		System.out.println("Shuffle :"+aob);
		
		
	}

}
