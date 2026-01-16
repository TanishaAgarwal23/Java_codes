package com.tanisha;

import java.util.Arrays;

public class SortArrays0s1s2s {

	public static void main(String args[]) {
		int a[]= {2,0,1,1,2,0,0,1,2,2,1};
	int n=a.length;
	int left=0,mid=0,right=n-1;
	while(mid<=right) {
		if(a[mid]==0) {
			int temp=a[left];
			a[left]=a[mid];
			a[mid]=temp;
			left++;
			mid++;
		}
		else if(a[mid]==1) {
			mid++;
		}
		else {
			int temp=a[mid];
			a[mid]=a[right]; 
			a[right]=temp;
			right--;
		}
	}
	System.out.println(Arrays.toString(a));
}
}
