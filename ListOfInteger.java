package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfInteger {
	public static void main(String[] args) {
		List<Integer> s = Arrays.asList(2,3,4,6,78,44,55,66,77);
		for (int i = 0; i < s.size(); i++) {
			for(int j=s.size()-1;j>=i;j--) {
				if(s.get(i)>s.get(j)) {
					int temp=s.get(i);
					s.set(i, s.get(j));
					s.set(j, temp);
					}
			}
			
		}
		for(int i: s) {
			System.out.println(i);
		}
	}

}
