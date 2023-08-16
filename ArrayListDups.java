package com.practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDups {
	public static void main(String[] args) {

		int[] a = { 1,2,3,4,5,6,6};
		int[] b = {3,4,5,6,7};
		List <Integer> d=new ArrayList<>();
//		for(int i=0;i<a.length;i++) {
//			int count=0;
//			for(int j=0;j<b.length;j++) {
//				if(a[i]==b[j]) {
//					count++;
//					
//				}
//			}
//			if(count==0) {
//				d.add(a[i]);
//			}
//		}
//		for(int i=0;i<b.length;i++) {
//			int count=0;
//			for(int j=0;j<a.length;j++) {
//				if(b[i]==a[j]) {
//					count++;
//				}
//			}
//			if(count==0) {
//				d.add(b[i]);
//			}
//		}
//		System.out.println(d);
		
		for(int i=0;i<a.length;i++) {
			int c=0;
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					c++;
				}
			}
			if(c==0) {
				d.add(a[i]);
			}
		}
		for(int i=0;i<b.length;i++) {
			int c=0;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					c++;
				}
			}
			if(c==0) {
				d.add(b[i]);
			}
		}
		System.out.println(d);
	}

}
