package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameDuplicates {
	public static void main(String[] args) {
		String name ="nishanthi";
		char [] c =name.toCharArray();
////		int count=0;
////		for (int i = 0; i <c.length; i++) {
////			
////			for(int j=i+1;j<c.length;j++) {
////				if(c[i]==c[j]) {
////					count++;
////				}
////			}
////			
////		}
//	//	System.out.println(count)
//		int	count=0;
//		for(int i=0;i<name.length();i++) {
//		
//			for(int j=0;j<name.length();j++) {
//				if(c[i]==c[j]) {
//				count++;
//			}
//		}
////		if(count==1) {
////			System.out.println(c[i]+""+count);
////
////		}
//
//		}
//		System.out.println(count);
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.println(c[i]);
				}
			}
		}
		
		
		
		
	}
}

