package com.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
	public static void main(String[] args) {
		Integer [] s = {1,2,3,4,5,6,7};
		List<Integer> c = Arrays.asList(s);
		Collections.reverse(c);
		System.out.println(c);
//		List<Integer> b = new ArrayList<>();
//		for (int i=c.size();i>0;i--) {
//			b.add(i);
//		}
//		Integer [] rev = b.toArray(new Integer[c.size()]);
//		for(int f:rev) {
//			System.out.print(f+" ");
//		}
	}

}
