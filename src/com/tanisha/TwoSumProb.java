package com.tanisha;
import java.util.Arrays;
public class TwoSumProb {
public static void main(String args[]) {
	int a[]= {2,5,8,6,1,4,-1,-4};
	System.out.println(twoSumProb(a,14));
	int n=8;
	boolean flag=false;
	for(int i=0;i<a.length;i++){
		int first=a[i];
		for(int j=i+1;j<a.length;j++) {
			int second=a[j];
			int sum=first+second;
			if(sum==n) {
				flag=true;
				break;
			}
		}
	}
	
	System.out.println(flag);
}
public static boolean twoSumProb(int a[],int n) {
	MergeSort.mergeSort(a);
		int start=0;
		int end=a.length-1;
		while(start<end) {
			int s=a[start]+a[end];
			if(s==n) {
				return true;
			}else if(s<n) {
				start++;
			}else {
				end++;
			}
		}
		return false;
				
			}
		
	}


