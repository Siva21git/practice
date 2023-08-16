package com.practice;

public class FirstAndLastWord {
	public static void main(String[] args) {
		String a= "Java is a programming java".toLowerCase();
		String []b = a.split(" ");
		if(b[0].equals(b[b.length-1])) {
			System.out.println("true");
		}
	}

}
