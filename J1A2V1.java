package com.practice;

import java.util.ArrayList;

public class J1A2V1 {
	public static void main(String[] args) {
		String a = "java";
		ArrayList<Character> n = new ArrayList<>();
		for(int i=0;i<a.length();i++) {
			if(n.contains(a.charAt(i))) {
			continue;
			}
			int c=0;
			for(int j=0;j<a.length();j++) {
				if(a.charAt(i)==a.charAt(j)) {
					c++;
				
				}
			}
			n.add(a.charAt(i));
			System.out.println(a.charAt(i)+"-"+c);
		}
		
	}

}
