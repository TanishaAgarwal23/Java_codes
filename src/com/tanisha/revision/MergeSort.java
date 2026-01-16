package com.tanisha.revision;

import java.util.Arrays;

public class MergeSort {

	public static void main(String args[]) {
		int a[]= {4,7,6,2,1,5};
		mergeSort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}
	
	public static void mergeSort(int a[],int start,int end) {
		if(start<end) {
		int mid=(start+end)/2;
			mergeSort(a,start,mid);
			mergeSort(a,mid+1,end);
			merge(a,start,mid,end);
		}
	}
	public static void merge(int a[],int start,int mid,int end)
	{
		int t[]=new int[a.length];
		int i=start;
		int j=mid+1;
		int k=start;
		while(i<=mid&&j<=end) {
			if(a[i]<a[j]) {
				t[k]=a[i++];
				}
			else {
				t[k]=a[j++];
			}
			k++;
		}
		while(i<=mid) {
			t[k++]=a[i++];
		}
		while(j<=end) {
			t[k++]=a[j++];
		}
		for(int x=start;x<=end;x++) {
			a[x]=t[x];
		}
	}
}
