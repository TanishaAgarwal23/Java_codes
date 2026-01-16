package com.tanisha;
import java.util.*;

public class nextPermutation {
	private static void swap(int arr[],int x,int y) {
		int temp=arr[x];
		arr[x]=arr[y];
		arr[y]=temp;
	}
public static void nextPermutation(int[] arr) {
	int l=arr.length;
	int i;
	for(i=l-2;i>=0 && arr[i+1]<=arr[i];i--);
		if(i>=0) {
			for(int j=l-1;j>i;j--) {
				if(arr[j]>arr[i]) {
					swap(arr,i,j);
					break;
				}
			}
		}
		for(int x=i+1,y=l-1; x<y;x++,y--) {
			swap(arr,x,y);
		}
	}
public static void main(String args[]) {
	int arr[]= {1,3,5,4,2};
  nextPermutation(arr);
  System.out.println(Arrays.toString(arr));
}


}
