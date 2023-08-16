package com.practice;

public class ReverseTheString {
	public static void main(String[] args) {
		String word ="I am from bangalore";
		String [] a =word.split(" ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
