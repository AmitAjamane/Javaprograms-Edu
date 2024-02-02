package com.edu27;

import java.util.Scanner;

public class InfiniteString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String s =sc.nextLine();//abcde;
		s=s.toLowerCase();
		String a="abcdeabcdeabcde";
		
		int l=s.length();
		for ( int i=0;i<s.length();i++) {
			for ( int j=0;j<a.length();j++) {
			if (s.charAt(i)==a.charAt(j)) {
				int count=0,n=0;
				for ( int k=j;k<j+l;k++) {
					if ( s.charAt(n)==a.charAt(k)) {
						count++;
					    n++;
				}
				}
				if ( count==l) {
					System.out.println("Yes");
				System.exit(0);
				}
				else {
					System.out.println("No");
					System.exit(0);
				}
			}
			}
		}
		
		

	}

}
