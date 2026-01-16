package com.prev;
import java.util.Arrays;
public class palindrome {
	 public static void main(String args[]) {
		  int a[]= {1,2,3,3,2,1};
		  
		   System.out.println(isPalindrome(a));
		
	}

	public static boolean  isPalindrome(int a[]) {
		for(int i=0,j=a.length-1;i<j;i++,j--) {
			System.out.println(i+","+j);
			if(a[i]!=a[j]) {
				return false;
				}
				
			}
		
			System.out.println();
			return true;
		}
	
	}


