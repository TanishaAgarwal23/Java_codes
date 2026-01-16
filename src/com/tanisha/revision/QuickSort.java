package com.tanisha.revision;

import java.util.Arrays;

public class QuickSort {

	public QuickSort() {
		
	}
	public static void main(String args[]) {
		int a[] = {6,4,3,7,1,2};
		quickSort(a,0,a.length-1);
		System.out.print(Arrays.toString(a));
	}
	
	public static void quickSort(int a[], int start, int end) {
		if(start<end) {
		int pivot = partition(a,start,end);
		quickSort(a,start,pivot-1);
		quickSort(a,pivot+1,end);
		}
		
	}
	public static int partition(int a[], int start, int end) {
		int pivot = a[start];
		int left = start +1;
		int right = end;
		while(left<right) {
			for(;pivot>a[left];left++); 
			for(;pivot<a[right];right--);
			if(left < right) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
			}else {
				a[start] = a[right];
				a[right] = pivot;
			}
			
		}
		return right;
	}
	

}
