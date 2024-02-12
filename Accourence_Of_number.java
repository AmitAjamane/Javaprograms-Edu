package com.edu26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Accourence_Of_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int a []= {2,5,3,2,4,5,8,9,6,7,4,1,2,3};
		ArrayList<Integer> list = new ArrayList<Integer> ();
		Scanner sc =new Scanner (System.in);
		
		for ( int i:a) {
			list.add(i);
		}
		
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		
		for (int i=0;i<list.size();i++) {
		 hm.putIfAbsent(list.get(i),Collections.frequency(list,list.get(i)));
		 }
		System.out.println(hm);
		
		for (Map.Entry<Integer,Integer> mapobj:hm.entrySet()){
			System.out.println(mapobj.getKey()+"-->"+mapobj.getValue());
		}
	}

}
