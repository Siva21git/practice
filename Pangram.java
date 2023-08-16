package com.practice;

import java.util.ArrayList;

public class Pangram {
	public static void main(String[] args) {
		int count =0;
		String  s="qwertyuiopasdfghjklmnbvcxz";
		ArrayList<Character> f = new ArrayList<>();
		for(int i=0;i<s.length();i++) {
			if(f.contains(s.charAt(i))) {
				continue;
			}
			
			if(s.charAt(i)>='a'&& s.charAt(i)<='z') {
				f.add(s.charAt(i));
			}
		}
		if(f.size()==26) {
			System.out.println("pangram");
		}else {
			System.out.println("non pangram");
		}
		
	}

}
