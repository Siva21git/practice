package com.practice;

import java.util.Comparator;
import java.util.TreeSet;

public class ArrayAscendingDescending {
	public static void main(String[] args) {
		String a ="1,3,6,2,5,4,9,7,8,10";
		String b[] =a.split(",");
		int c[] = new int[a.length()];
		for(int i=0;i<b.length;i++) {
			c[i]=Integer.parseInt(b[i]);
		}
		TreeSet<Integer> n = new TreeSet<>();
		for(int d:c) {
			n.add(d);
		}
		System.out.println(n);
		
		TreeSet<Integer> m = new TreeSet<>(Comparator.reverseOrder());
		for(int v:c) {
			m.add(v);
		}
		System.out.println(m);
	}

}
