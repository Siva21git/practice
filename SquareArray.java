package com.practice;

public class SquareArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,16,89,6};
		for(int i=1;i<a.length;i++) {
			int x=i*i;
			for(int j=0;j<a.length;j++) {
				if(x>20) {
					System.out.println(a[i]);
				}
			}
		}
	}

}
