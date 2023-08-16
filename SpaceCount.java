package com.practice;

import java.util.Arrays;
import java.util.List;

public class SpaceCount {
	public static void main(String[] args) {
		String [] val= {"rajesh"," ","samuel"," "};
		List<String> s = Arrays.asList(val);
		long count= s.stream().filter(x->x.equals(" ")).count();
		System.out.println(count);
	}
}
