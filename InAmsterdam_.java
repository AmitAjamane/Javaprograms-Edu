package com.edu27;

import java.util.Scanner;

public class InAmsterdam_ {

	 public static void main(String[] args) {
	        InAmsterdam_ amsterdamCounter = new InAmsterdam_();

	       Scanner sc = new Scanner (System.in);
	        String input = sc.nextLine(); //I Am in Amsterdam am I

	      
	        int result = amsterdamCounter.countAm(input);
	        System.out.println(result); 
	    }
	    public int countAm(String str) {
	        if (str == null || str.isEmpty()) {
	            return 0;
	        }

	        
	        str = str.toLowerCase();

	     
	        String[] words = str.split("\\W+");

	        int count = 0;
	        for (String word : words) {
	           
	            if (word.equals("am")) {
	                count++;
	            }
	        }

	        return count;}
}

