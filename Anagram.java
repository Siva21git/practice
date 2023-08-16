package com.practice;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String a="juk";
		String b="kju";
		int c=0;
		if(a.length()==b.length()) {
			char [] x=a.toCharArray();
			char [] y=b.toCharArray();
			Arrays.sort(x);
			Arrays.sort(y);
			for(int i=0;i<x.length;i++) {
				for(int j=0;j<y.length;j++) {
					if(x[i]==y[j]) {
						c++;
					}
				}
			}
			if(c==a.length()) {
				System.out.println("anagram");
			}else {
				System.out.println("not anagram");
			}
		}
	}

}
