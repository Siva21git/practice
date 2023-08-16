package com.practice;

public class FindFirstDuplicateInArray {
	public static void main(String[] args) {
		int [] a = {1,3,4,5,3,6,7,};
		int c=0;
		int min=a.length;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]&& min>j) {
				c=a[i];
				min=j;
				}
			}
		}
	if(min<a.length) {
		System.out.println(c);
	}
	}

}
