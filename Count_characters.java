

// 1.Count Character from String **********************
//29-dec-2024;
package com.edu27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Count_characters {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the String");
		String str= sc .nextLine();
	
		int frequency [] = new int [str.length()];
		 char string[]=str.toCharArray();
		 
		 for ( int i=0;i<str.length();i++) {
		 
			 frequency[i]=1;
			 for ( int j=i+1;j<str.length();j++) {
				 
				 if(string[i]==string[j]) {
					 frequency[i]++;
					 string[j]='0';
				 }
			 }
		 }
		 
		 for(int i = 0; i <frequency.length; i++) 
	        {  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.println(string[i] + "=" + frequency[i]);  
	        }  
		
	}
}
