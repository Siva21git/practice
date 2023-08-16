package com.practice;

public class RemoveOneFromString {
	public static void main(String[] args) {
	String a ="abc123def";
	String x="";
	for(int i=a.length()-1;i>=0;i--) {
		if(a.charAt(i)=='1') {
			continue;
			
		}
		x=x+a.charAt(i);
	}
	System.out.println(x);
	}
}
