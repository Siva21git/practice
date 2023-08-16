package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
	public static void main(String[] args) {
//		List<Integer> c = Arrays.asList(10,2,24,3,2,4,5);
//		int total =c.stream().reduce(1,(i,j)->i*j);
//		System.out.println(total);
//		Integer [] nums = {1,45,2,4,56,33};
//		Integer max = nums[0];
//		for(int i =0; i<nums.length;i++) {
//			if(max<nums[i]) {
//				max= nums[i];
//			}
//		}
//		System.out.println(max);
//		Integer [] a= {2,3,5,7,4,3,22};
//		int c , b;
//		b= a.length;
//		for(int i =0;i<a.length;i++) {
//			for(int j=i;i<a.length;j++) {
//				if(a[i]>a[j]) {
//					c=a[i];
//					a[i]=a[j];
//					a[i]=c;
//				}
//			}
//		}
//		System.out.println(a[b-1]);
//		List<Integer> n = Arrays.asList(a);
//		long mx=   n.stream().max(Integer::compare).get();
//		System.out.println(mx);
//		
//		===================================================
//		String n ="praveen";
//		int count =0;
//		for(int i=0;i<n.length();i++) {
//			if(n.charAt(i)=='a'|| n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u') {
//				count++;
//			}
//		}
//		System.out.println(count);
//		==========================================
//		char [] x = n.toCharArray();
//		List<char[]> c = Arrays.asList(x);
//		long count1= n.chars().filter(z->z=='a'||z=='e'||z=='i'||z=='o'||z=='u').count();
//		System.out.println(count1);
//		String str ="java is a programming language";
//		String []s = str.split(" ");
//		for(int i=0;i<s.length;i++) {
//			for(int j=s.length-1;j>=i;j--) {
//				if(s[i].length()>s[j].length()) {
//					String temp = s[i];
//					s[i]=s[j];
//					s[j]=temp;
//				}
//			}
//			
//		}
//		String b=""; 
//		for(int i=0;i<s.length;i++) {
//			b=b+s[i]+" ";
//		}
//		System.out.println(b);
	//	===========================================================================
//		String [] str = {"apple"," ","orange"," ","banana"};
//		List<String> s = Arrays.asList(str);
//		List<String > d = s.stream().filter(x->x!=" ").collect(Collectors.toList());
//		System.out.println(d);
//		for(int i=5;i>0;i--) {                    //555554444333221
//			for(int j=i;j>0;j--) {                       
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		for(int i=5;i>0;i--) {                   //54321432132121
//			for(int j=i;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	
//	==============================================================
		    
//		        int[] input = {1, 7, 5, 3};
//		        Arrays.sort(input);
//
//		        int max = input[input.length - 1];
//		        int min = input[0];
//		        
//		        for (int i = min; i < max; i++) {
//		            if (Arrays.binarySearch(input, i) < 0) {
//		                System.out.println(i);
//		            }
//		        }
//		    }
	
	

//	        int[] input = {1, 7, 5, 3};
//	        Arrays.sort(input);
//	        
//	        int prev = input[0];
//	        for (int num : input) {
//	            while (prev < num - 1) {
//	                prev++;
//	                System.out.print(prev + " ");
//	            }
//	            prev = num;
//	        }
//	=======================================================================
//		        int start = 2;
//		        int end = 100;
//
//		        System.out.println("Prime numbers between " + start + " and " + end + ":");
//		        
//		        for (int num = start; num <= end; num++) {
//		            if (isPrime(num)) {
//		                System.out.print(num + " ");
//		            }
//		        }
//		    }
//
//		    // Function to check if a number is prime
//		    public static boolean isPrime(int num) {
//		        if (num <= 1) {
//		            return false;
//		        }
//		        for (int i = 2; i <= Math.sqrt(num); i++) {
//		            if (num % i == 0) {
//		                return false;
//		            }
//		        }
//		        return true;
//		    }
//			==============================================================================
//		Integer [] a = {2,3,1,5,4};
//		List<Integer> v = Arrays.asList(a);
//		v.stream().sorted().toList().forEach(x->System.out.println(x));
		
//		List<String > b = Arrays.asList("siva","figooo","king","kumar");
//		String m= b.stream().max(Comparator.comparing(String::length)).get();
//		System.out.println(m);
//		String a = "Onesoft";
//		char [] ch = a.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			int c=1;
//			for(int j=i+1;j<ch.length;j++) {
//				if(ch[i]==ch[j]) {
//					c++;
//					
//				}
//			}
//		}
//		Integer f = v.stream().collect(Collectors.summingInt(Integer::intValue));
//		System.out.println(f);
		
	//	int start =2;
	//	int end = 50;
//		for(int num =start;num<=end;num++) {
//			int count =0;
//			for(int i=2;i<=num/2;i++) {
//				if(num%i==0) {
//					count++;
//					break;
//				}
//			}
//			if(count==0&& num!=1) {
//				System.out.println(num);
//			}
//		}
//		
//		for(int num =start;num<=end;num++) {
//			int c=0;
//			for(int i=2;i<=num/2;i++) {
//				if(num%i==0) {
//					c++;
//					break;
//				}
//			}
//			if(c==0&& num!=0) {
//				System.out.println(num);
//			}
//		}
//		
//		
//		
//		        int[] input = {1,3,5,10}; // Input array
//		        int minRange = 1;
//		        int maxRange = 10;
//		        
//		        System.out.println("Missing numbers between " + minRange + " and " + maxRange + ":");
//		        
//		        boolean[] found = new boolean[maxRange + 1];
//		        
//		        for (int num : input) {
//		            found[num] = true;
//		        }
//		        
//		        for (int i = minRange; i <= maxRange; i++) {
//		            if (!found[i]) {
//		                System.out.print(i + " ");
//		            }
//		        }
		
		List<Integer> li = Arrays.asList(2,3,7,1,9,200,21,3,17);
		
	//	List<Integer>c = li.stream().sorted(Integer::compare).toList();
	//	System.out.println(c);
		//remove dups and reverse order
	//	 li.stream().distinct().sorted(Comparator.reverseOrder()).forEach(x->System.out.println(x));
	//	 li.stream().distinct().sorted(Comparator.comparingInt(Integer::intValue).reversed()).forEach(x->System.out.println(x));
		//comparetor
	//	li.stream().sorted((x,y)->x-y).forEach(x->System.out.println(x));
		
	//	li.stream().skip(2).forEach(x->System.out.println(x));
	//   Integer n = li.stream().filter(x->x>8).findFirst().get();
	//   System.out.println(n);
		//converting integer to string and finding the string which is starts with 2 and again converting string to integer 
	//	 li.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("2")).map(x->Integer.valueOf(x)).sorted((x,y)->y-x).forEach(x->System.out.println(x));
//		 Integer n= li.stream().sorted((x,y)->y-x).findFirst().get();
//		System.out.println(n);
		// summing by summing method 
//		long v= li.stream().collect(Collectors.summingInt(Integer::intValue));
//		System.out.println(v);
		// summing by reduce method
//		Integer c = li.stream().reduce((x,y)->x+y).get();
//		System.out.println(c);
//		Integer v = li.stream().reduce(0,(x,y)->x>y?x:y);
//		System.out.println(v);
//		Integer c= li.stream().reduce(0,(Integer::max));
//		System.out.println(c);
		Integer v =li.stream().reduce(Integer::min).get();
		System.out.println(v);
		Integer max = li.stream().max(Comparator.comparing(Integer::intValue)).get();
		System.out.println(max);
		List<String> s = Arrays.asList("siva","nandy");
		
		
	 }
	
	
}
	
	



