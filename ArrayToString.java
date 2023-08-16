package com.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {
	public static void main(String[] args) {
		int [] a= {3,4,5,1,2};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			temp=temp*10+a[i];
		}
		System.out.println(temp);
		
		
		String n = Arrays.stream(a).mapToObj(String::valueOf).collect(Collectors.joining(""));
		System.out.println(n);
	}

}
