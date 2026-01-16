//given an array find the longest continuous increasing subsequence
package com.tanisha;
import java.util.Arrays;
public class array4 {
public static void main(String args[]) {
	int a[]= {7,8,1,2,3,4,5};
	increasingSubsequence(a);
}
public static void increasingSubsequence(int a[]) {
	int max=0;
	int count=1;
	for(int i=0;i<a.length-1;i++) {
	 if(a[i]<=a[i+1]) {
		 count++;
	 } 
	 else { 
		 if(count>max) {
		 max=count;
	 }
	 count=1;
	 }
	}
	if(count>max) {
		max=count;
	}
	
	System.out.println(max);
}
}
