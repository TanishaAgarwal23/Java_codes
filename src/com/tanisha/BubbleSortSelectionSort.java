package com.tanisha;

import java.util.Arrays;

public class BubbleSortSelectionSort{

public static void main(String args[]) {
	int a[]= {4,5,2,1,3};
	bubblesort(a);
	selectionsort(a);
	minSelectionSort(a);
}
public static void bubblesort(int a[]) {
	for(int i=0;i<a.length-1;i++) {
		int swap=0;
		boolean flag = true;
	for(int j=0;j<a.length-i-1;j++) {
		if(a[j]>a[j+1]) {                 //optimized bubble sort
			int temp= a[j];               //best case - O(n)
			a[j]=a[j+1];
			a[j+1]=temp;
			flag = false;
		swap++;
			}
		
	}
	if (flag == true) break;
			System.out.println(swap+" ");
	}
	System.out.println(Arrays.toString(a));
}
public static void selectionsort(int a[])
{

	for(int i=0;i<a.length-1;i++) {
		 int maxIndex=0;
	
		   for(int j=1;j<a.length-i;j++) {
			   if(a[j]>a[maxIndex]) {
				   maxIndex=j;
			   }
			   }
		  
				  int temp= a[maxIndex];
				
				a[maxIndex]=a[a.length-i-1];
				a[a.length-i-1]=temp;
				}
	
	 System.out.println(Arrays.toString(a));

	 
}
public static void minSelectionSort(int a[]) {
	int n = a.length;
	for(int i = 0;i<a.length;i++) {
		int minIdx=i;
		for(int j = i+1;j<n;j++) {
			if(a[j]<a[minIdx]) {
				minIdx = j;	
			}
			  int temp= a[minIdx];
				a[minIdx]=a[i];
				a[i]=temp;
				}
		}
	System.out.println(Arrays.toString(a));
		
	}
}

   



