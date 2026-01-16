package com.tanisha;
import java.util.Arrays;


public class MergeSort {
	public static void main(String args[]) {
		int a[]= {4,7,1,5,3,8,2,6};
		mergeSort(a);
		}
		
	public static void mergeSort(int[] a) {
        mergeSort(a, 0, a.length-1); 
        System.out.println(Arrays.toString(a));
    }
	

    private static void mergeSort(int[] a, int start, int end) {
        if(start < end) {
            int mid = (start + end)/2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private static void merge(int a[], int start, int mid, int end) {
        int t[] = new int[a.length];
        int k = start, i = start, j = mid + 1;
        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                t[k] = a[i];
                i++;
            } else {
                t[k] = a[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            t[k] = a[i];
            i++;
            k++;
        }

        while (j <= end) {
            t[k] = a[j];
            j++;
            k++;
        }

        for (int x = start; x <= end; x++) {
            a[x] = t[x];
        }
    }
}
