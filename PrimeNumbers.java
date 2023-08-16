package com.practice;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrimeNumbers {
//	public static void main(String[] args) {
//    int start = 2;
//    int end = 100;
//    for(int num=start; num<=end;num++) {
//    	if(isPrime(num)) {
//    		System.out.println(num);
//    	}
//    	}
//    }
//    public static boolean isPrime(int num) {
//    	if(num<=1) {
//    		return false;
//    	}if(num==2) {
//    		return true;
//    	}if(num%2==0) {
//    		return false;
//    	}
//    	for(int i=3;i<=num/2;i++) {
//    		if(num%i==0) {
//    			return false;
//    		}
//    	}
//    		return true;
//
//  }
	public static void main(String[] args) {
//		int start =2;
//		int end =50;
//		for(int num=start;num<=end;num++) {
//			if(isPrime(num)) {
//				System.out.println(num);
//				}
//		}
//		}
//		public static boolean isPrime(int num) {
//			if(num<=1) {
//				return false;
//			}if(num==2) {
//				return true;
//			}if(num%2==0) {
//				return false;
//			}for(int i=2;i<=num/2;i++) {
//				if(num%i==0) {
//					return false;
//				}
//			}
//			return true;
//		int start=2;
//		int end =50;
//		for(int num=start;num<=end;num++){
//		if(isPrime(num)){
//		System.out.println(num);
//		}
//		}
//		}
//		public static boolean isPrime(int num){
////		if(num<=1){
////		return false;
////		}if(num==2){
////		return true;
////		}if(num%2==0){
////		return false;
////		}
//		for(int i=2;i<=num/2;i++){
//		if(num%i==0){
//		return false;
//		}
//		}
//		return true;
		
		Date date = new Date();
		SimpleDateFormat f = new SimpleDateFormat("E dd MMMM yyyy");
		String str = f.format(date);
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		

	}
    
}