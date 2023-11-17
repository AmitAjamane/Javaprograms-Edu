package com.edu;

public class JackedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [][] arr=new int[2][];
				arr[0]=new int[3];
				arr[1]=new int[4];
				int c=2;
	 for ( int i=0;i<arr.length;i++) {
		 for ( int j=0;j<arr[i].length;j++) {
			 arr[i][j]=c++;
		 }
		 
	 }
	 
	 for ( int i=0;i<arr.length;i++) {
		 System.out.println(" ");
		 for ( int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
	 }
	}

}
