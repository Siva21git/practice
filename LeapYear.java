package com.practice;

public class LeapYear {
	
	public static boolean leapyear(int year) {
		if( year%4==0 && year%100 !=0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		boolean isleapyear = leapyear(2016);
		if(isleapyear) {
			System.out.println("is leap year");
		}else {
			System.out.println("not leap year");
		}
	}

}
