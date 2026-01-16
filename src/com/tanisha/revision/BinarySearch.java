package com.tanisha.revision;

public class BinarySearch {

public static void main(String args[]) {
	int a[]= {2,4,7,8,9};
	int n=4;
 System.outbinarySearch
}
public static int binarySearch(int a[],int start,int end,int n) {
	if(start>end) {
		return -1;
	}
	int mid=(start+end)/2;
	if(n==a[mid]) {
		return mid;
	}
	if(n<a[mid]) {
		return binarySearch(a,start,mid-1,n);
		
	}
	
		return binarySearch(a,mid+1,end,n);
		
	
}
}
