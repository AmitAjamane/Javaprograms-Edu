   //1 1 2 3 5 .......................nterms
package com.edu;

import java.util.Scanner;

public class FibonashiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		int num1=1,num2=1,num3, n; 
		
		System.out.println("Enter of terms of Fibonacci series");
		n=sc.nextInt(); //n=7
		
		//o/p
		System.out.println("Fibonacci Series");
		System.out.print(num1+"  "+num2+" "); //1  1   ,7-2=5
		
		
		for(int i=1;i<=n-2;i++) {
			num3 = num1+num2; //1+1    1+2 2+3
			System.out.print(num3+" ");  //1  1  2  3
			 
			                            //  num1  num2
			num1=num2;
			num2=num3;
		}
		
		
		
		
		
	}

}
