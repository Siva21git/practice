package com.practice;

public class Finonacci {
	int a=0;
	int b=1;
	int c=0;
	public void fibo(int n) {
		if(n<=9) {
			c=a+b;
			System.out.println(a);
			a=b;
			b=c;
			fibo(n+1);
		}
	}
	public static void main(String[] args) {
		Finonacci f = new Finonacci();
		f.fibo(0);
	}
	
	
//	public static void main(String[] args) {
//		int a=0;
//		int b=1;
//		int c=0;
//		for(int i=1;i<=9;i++) {
//			c=a+b;
//			System.out.println(a);
//			a=b;
//			b=c;
//		}
//	}

}
