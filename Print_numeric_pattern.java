package com.edu27;

import java.util.Scanner;

public class Print_numeric_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner (System.in);
		int a[] = new int[3];
		int i,j;
		for ( int k=0;k<a.length;k++) {
		  a[k]=sc.nextInt();
	}
		for ( int n=0;n<a.length;n++) {
			
        for (i =1; i<=a[n];i++) {
            
            for (j =1;j<=a[n]-i;j++) {
                System.out.print(" ");
            }
            for (j = 1; j <=i; j++) {
                System.out.print( i+ " ");
            }
           System.out.println();
        }
		}
	}

}
