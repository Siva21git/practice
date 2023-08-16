package com.practice;

public class CountDuplicates {
	public static void main(String[] args) {
		String [] a= {"t","e","e","s","s","s","h"};
		String x="";
		for(int i=0; i<a.length;i++) {
			int count =1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					i=j;
				}
			}
			if(count>1) {
				x=x+a[i]+count;
			}else {
				x=x+a[i];
			}
		}
		System.out.println(x);
	}

}
