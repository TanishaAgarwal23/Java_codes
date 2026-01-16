package com.tanisha.revision;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String args[]) {
		int a[]= {7,1,4,3,8,2};
		insertionSort(a);
		
	}
	public static void insertionSort(int a[]) {
		int b[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>=0;j--) {
				if(j>0 && a[i]<b[j-1]) {
					b[j]=b[j-1];
				}
				else {
					b[j]=a[i];
					break;
				}
			}
			
		}
		System.out.println(Arrays.toString(b));
	}

}
