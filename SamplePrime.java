package com.practice;

public class SamplePrime {
//	public static void main (String[] args){
//		int start =2;
//		int end = 50;
//		for(int num=start; num<=end;num++){
//		if(isPrime(num)){
//		System.out.println(num);
//		}
//		}
//		}
//		public static boolean isPrime(int num){
//		for(int i=2;i<=num/2;i++){
//		if(num%i==0){
//		return false;
//		}
//		}
//		return true;
//		
//		}
	public static void main (String [] args){
		int start =2;
		int end = 50;
		for(int num =start;num<=end;num++){
		if(isPrime(num)){
		System.out.println(num);
		}
		}
		}
		public static boolean isPrime(int num){
		for(int i=2;i<=num/2;i++){
		if(num%i==0){
		return false;
		}
		}
		return true;
		}
}
