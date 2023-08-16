package com.practice;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=15;
		int arm=0;
		int nums=num;
		while(num>0) {
			arm=arm+(num%10)*(num%10)*(num%10);
			num=num/10;
		}
		if(arm==nums) {
			System.out.println("is armstrong");
		}else {
			System.out.println("is not armstrong");
		}
	}

}
