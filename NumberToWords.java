package com.practice;

public class NumberToWords {

	static String []unit = new String [] {"zero","one","two","three","four","five","six","seven","eight","nine","ten"
				,"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static	String [] twenties = new String []{"","","twenty","thrity","forty","fify"};
		public static String word(int number) {
			if(number<30) {
				return twenties[number/10]+((number%10!=0)?""+unit[number%10]:"");
			}
			
			if(number<40) {
				return twenties[number/10]+((number%10!=0)?""+unit[number%10]:"");
		}
	return "number out of range";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		public static void main(String[] args) {
			int number =2;
			String x= word(number);
			System.out.println(x);
		}
}
