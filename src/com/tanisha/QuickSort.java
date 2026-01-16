package com.tanisha;
import java.util.Arrays;
public class QuickSort {
	public static void main(String args[]) {
	int a[]= {4,7,1,5,3,8,2,6};
		//int a[] = {9,7};
	quickSort(a);
	}
	public static void quickSort(int[] a) {
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
    private static void quickSort(int[] a, int start, int end) {
if(start<end) {
    	  //System.out.println(start+","+end);
 int pivot = partition(a,start,end);      
//System.out.println(start+"," +pivot+","+end);
  quickSort(a,start,pivot-1);
  quickSort(a,pivot+1,end);
}
	}
    private static int partition(int[] a, int start, int end) {
    	int pivot = a[start];
    	int left = start; // 0
    	int right = end; // 1
    while(left<right) { //false
    	
    	for(;left<=end && a[left]<=pivot;left++);         //l>pivot
    	
    	for(;right>start && a[right]>pivot ;right--);       //r<pivot
    if(left<right) {
    	int temp = a[left];
    	a[left]=a[right]; 
    	a[right]=temp;
    }
   }
    int temp = a[start];
	a[start]=a[right];
	a[right]=temp;
    
	return right;
	
}
}
